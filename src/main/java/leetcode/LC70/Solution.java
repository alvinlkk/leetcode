package leetcode.LC70;

/**
 * <p>描 述：</p>
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/16  13:07
 */
public class Solution {

    public int climbStairs(int n) {
        if (n < 0) {
            return 0;
        }
        // 定义状态
        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                dp[i] = 1;
            } else if (i == 1) {
                dp[i] = 1;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
}
