import java.util.*;

public class MaxUnits {
    public static int maximumUnits(int[][] arr, int cap) {
        Arrays.sort(arr, (x, y) -> y[1] - x[1]);
        int total = 0;
        for (int[] a : arr) {
            if (cap == 0) {
            break;
            }
            int cnt = Math.min(cap, a[0]);
            total += cnt * a[1];
            cap -= cnt;
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] arr = {{2,7},{2,9},{9,1}};
        int cap = 6;
        System.out.println(maximumUnits(arr, cap));
    }
}
