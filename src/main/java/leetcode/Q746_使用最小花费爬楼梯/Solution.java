package leetcode.Q746_使用最小花费爬楼梯;

/**
 * <p>描 述：</p>
 * 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。
 * <p>
 * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
 * <p>
 * 请你计算并返回达到楼梯顶部的最低花费。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/17  19:37
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // 状态， 定义花费的金额
        int size = cost.length;
        int[] dp = new int[size];

        // 初始值
        dp[0] = cost[0];
        dp[1] = cost[1];
        // 状态转移方程 dp[i] = min(dp[i-1], dp[i-2]) + cost[i]
        for (int i = 2; i < size; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        // 返回结果
        return Math.min(dp[size - 1], dp[size - 2]);
    }

    // 官方写法，
    public int minCostClimbingStairs2(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }

}
