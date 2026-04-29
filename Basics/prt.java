import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class prt {

    // ===== MODEL =====
    static class User {
        String userId;
        String name;

        User(String userId, String name) {
            this.userId = userId;
            this.name = name;
        }
    }

    // ===== SHARD =====
    static class Shard {
        Map<String, User> master = new ConcurrentHashMap<>();
        Map<String, User> slave = new ConcurrentHashMap<>();
        boolean isActive = true;

        void replicate() {
            slave.clear();
            slave.putAll(master);
        }
    }

    // ===== SHARD MANAGER =====
    static class ShardManager {
        int totalShards = 3;
        Map<Integer, Shard> shards = new HashMap<>();

        ShardManager() {
            for (int i = 0; i < totalShards; i++) {
                shards.put(i, new Shard());
            }
        }

        int getShardId(String key) {
            return Math.abs(key.hashCode()) % totalShards;
        }

        void write(User user) {
            int shardId = getShardId(user.userId);
            Shard shard = shards.get(shardId);

            if (!shard.isActive) {
                throw new RuntimeException("Shard " + shardId + " is DOWN!");
            }

            shard.master.put(user.userId, user);
            shard.replicate();
        }

        User read(String userId, boolean fromMaster) {
            int shardId = getShardId(userId);
            Shard shard = shards.get(shardId);

            if (!shard.isActive) {
                throw new RuntimeException("Shard " + shardId + " is DOWN!");
            }

            return fromMaster ? shard.master.get(userId) : shard.slave.get(userId);
        }

        void failShard(int shardId) {
            shards.get(shardId).isActive = false;
        }

        void recoverShard(int shardId) {
            shards.get(shardId).isActive = true;
            shards.get(shardId).replicate();
        }
    }

    // ===== PERFORMANCE TEST =====
    static class Tester {
        ShardManager manager = new ShardManager();

        void runTest() {
            System.out.println("=== WRITE TEST ===");

            long start = System.currentTimeMillis();

            for (int i = 0; i < 1000; i++) {
                manager.write(new User("user" + i, "Name" + i));
            }

            long writeTime = System.currentTimeMillis() - start;
            System.out.println("Write Time: " + writeTime + " ms");

            System.out.println("\n=== READ TEST (SLAVE) ===");

            start = System.currentTimeMillis();

            for (int i = 0; i < 500; i++) {
                manager.read("user" + i, false);
            }

            long readTime = System.currentTimeMillis() - start;
            System.out.println("Read Time: " + readTime + " ms");

            System.out.println("\n=== CONSISTENCY TEST ===");

            User u = new User("specialUser", "Test");
            manager.write(u);

            User slaveRead = manager.read("specialUser", false);

            if (slaveRead == null) {
                System.out.println("Replication Lag Detected!");
                manager.shards.get(manager.getShardId("specialUser")).replicate();
                slaveRead = manager.read("specialUser", false);
            }

            System.out.println("Slave Read Success: " + (slaveRead != null));

            System.out.println("\n=== FAILURE TEST ===");

            int shardId = manager.getShardId("failUser");

            manager.failShard(shardId);

            try {
                manager.write(new User("failUser", "Fail"));
            } catch (Exception e) {
                System.out.println("Write Failed: " + e.getMessage());
            }

            System.out.println("Recovering shard...");
            manager.recoverShard(shardId);

            manager.write(new User("failUser", "Recovered"));
            System.out.println("Write Successful After Recovery!");
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.runTest();
    }
}