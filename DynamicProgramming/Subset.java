import java.util.*;

public class Subset{
    static boolean subsetExists(int[] arr, int target) {
        int len = arr.length;
        boolean[][] table = new boolean[len + 1][target + 1];

        for (int i = 0; i <= len; i++)
            table[i][0] = true;

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] > j)
                    table[i][j] = table[i - 1][j];
                else
                    table[i][j] = table[i - 1][j] || table[i - 1][j - arr[i - 1]];
            }
        }

        return table[len][target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();

        if (subsetExists(nums, sum))
            System.out.println("Subset found ");
        else
            System.out.println("Subset not found ");

        sc.close();
    }
}
