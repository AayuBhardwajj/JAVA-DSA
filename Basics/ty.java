import java.util.*;
import java.util.concurrent.*;

public class ty {

    // ===== MODEL =====
    static class Order {
        String orderId;
        String status;

        Order(String orderId) {
            this.orderId = orderId;
            this.status = "PENDING";
        }
    }

    // ===== QUEUES =====
    static BlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();
    static BlockingQueue<Order> deadLetterQueue = new LinkedBlockingQueue<>();

    // ===== INVENTORY SERVICE =====
    static class InventoryService {
        static boolean process(Order order) {
            // Simulate random failure
            if (Math.random() < 0.3) {
                throw new RuntimeException("Inventory failed");
            }
            System.out.println("Inventory processed for " + order.orderId);
            return true;
        }
    }

    // ===== NOTIFICATION SERVICE =====
    static class NotificationService {
        static void notifyUser(Order order) {
            System.out.println("Notification sent for " + order.orderId);
        }
    }

    // ===== RETRY HANDLER =====
    static void processWithRetry(Order order, int maxRetries) {
        int attempt = 0;
        int delay = 500;

        while (attempt < maxRetries) {
            try {
                InventoryService.process(order);
                order.status = "COMPLETED";
                NotificationService.notifyUser(order);
                return;
            } catch (Exception e) {
                attempt++;
                System.out.println("Retry " + attempt + " for " + order.orderId);

                try {
                    Thread.sleep(delay);
                } catch (InterruptedException ignored) {}

                delay *= 2; // exponential backoff
            }
        }

        System.out.println("Sending to Dead Letter Queue: " + order.orderId);
        deadLetterQueue.add(order);
    }

    // ===== PRODUCER =====
    static void produceOrder(String id) {
        Order order = new Order(id);
        orderQueue.add(order);
        System.out.println("Produced order: " + id);
    }

    // ===== CONSUMER =====
    static void startConsumer() {
        new Thread(() -> {
            while (true) {
                try {
                    Order order = orderQueue.take();
                    processWithRetry(order, 3);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }).start();
    }

    // ===== DEAD LETTER CONSUMER =====
    static void startDeadLetterConsumer() {
        new Thread(() -> {
            while (true) {
                try {
                    Order order = deadLetterQueue.take();
                    System.out.println("🚨 DEAD LETTER: " + order.orderId);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }).start();
    }

    // ===== SYNCHRONOUS PROCESS =====
    static void synchronousProcess(String id) {
        long start = System.currentTimeMillis();

        Order order = new Order(id);
        try {
            InventoryService.process(order);
            NotificationService.notifyUser(order);
            order.status = "COMPLETED";
        } catch (Exception e) {
            order.status = "FAILED";
        }

        long time = System.currentTimeMillis() - start;
        System.out.println("SYNC Order " + id + " Status: " + order.status + " Time: " + time + "ms");
    }

    // ===== MAIN =====
    public static void main(String[] args) throws Exception {

        System.out.println("=== ASYNC SYSTEM START ===");
        startConsumer();
        startDeadLetterConsumer();

        long asyncStart = System.currentTimeMillis();

        // Produce async orders
        for (int i = 1; i <= 10; i++) {
            produceOrder("ORD-A" + i);
        }

        Thread.sleep(5000); // wait for processing

        long asyncTime = System.currentTimeMillis() - asyncStart;

        System.out.println("\n=== SYNC SYSTEM START ===");

        long syncStart = System.currentTimeMillis();

        for (int i = 1; i <= 10; i++) {
            synchronousProcess("ORD-S" + i);
        }

        long syncTime = System.currentTimeMillis() - syncStart;

        System.out.println("\n=== RESULT ===");
        System.out.println("Async Time: " + asyncTime + " ms");
        System.out.println("Sync Time: " + syncTime + " ms");

        System.out.println("\n=== ANALYSIS ===");
        System.out.println("Async is faster for bulk processing and fault tolerant.");
        System.out.println("Sync is simpler but slower and blocks execution.");
    }
}