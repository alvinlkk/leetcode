package leetcode.LC62;

/**
 * <p>描 述：</p>
 * 一个机器人位于一个 m x n网格的左上角 （起始点在下图中标记为 “Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * <p>
 * 问总共有多少条不同的路径？
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/22  18:42
 */
public class Solution {

    /**
     * 典型的动态规划题目， 分成子问题，后一个结果由前一个结果转换得到
     * 1. 状态
     * dp[i][j] 表示到达ij位置的走法次数
     * <p>
     * 2.方程
     * <p>
     * dp[i][j] = dp[i-1][j] + dp[i][j-1]
     * <p>
     * 3.初始状态
     * dp[0][i] = 1
     * dp[i][0] = 1
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // 初始状态
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    /**
     * 状态： dp[m][n]
     * 方程：
     * 1. 如果位置只能往下移动，dp[m][n] = dp[m-1][n]
     * 2. 如果位置只能往右移动，dp[m][n] = dp[m][n-1]
     * 3. 如果能够往下也能往右移动， dp[m][n] = dp[m-1]dp[n] + dp[m][n-1]
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m][n];

        // 初始状态
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j > 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else if (i > 0) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j > 0) {
                    dp[i][j] = dp[i][j - 1];
                }

            }
        }
        return dp[m - 1][n - 1];
    }
}
