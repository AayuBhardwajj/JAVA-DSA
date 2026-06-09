package Placement;
import java.util.Arrays;

public class UniquePaths2 {

    int m;
    int n;
    int[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        m = obstacleGrid.length;
        n = obstacleGrid[0].length;

        dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        return helper(obstacleGrid, 0, 0);
    }

    private int helper(int[][] obstacleGrid, int i, int j) {

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (i < 0 || i >= m || j < 0 || j >= n || obstacleGrid[i][j] == 1) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int right = helper(obstacleGrid, i, j + 1);
        int down = helper(obstacleGrid, i + 1, j);

        return dp[i][j] = right + down;
    }

    public static void main(String[] args) {

        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        UniquePaths2 obj = new UniquePaths2();

        System.out.println(obj.uniquePathsWithObstacles(obstacleGrid));
    }
}