import java.util.*;

public class MinPicks {

    public static int minPicks(int[] boxes, int k) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.add(0);
        visited.add(0);

        int targetMod = 0;
        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int s = 0; s < size; s++) {
                int curr = q.poll();

                if (curr % k == targetMod && curr != 0) {
                    return steps;
                }

                for (int box : boxes) {
                    if (box >= k) {
                        int next = curr + k;
                        if (!visited.contains(next)) {
                            visited.add(next);
                            q.add(next);
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] boxes = {5, 7, 9};
        int k = 3;

        System.out.println("Minimum picks: " + minPicks(boxes, k));
    }
}