package leetcode.LC122;

/**
 * <p>描 述：</p>
 * 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
 * <p>
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
 * <p>
 * 返回 你能获得的 最大 利润 。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/24  17:55
 */
public class Solution {

    /**
     * 动态规划
     * 1. 状态
     * dp[i][j]: 第i天状态为j(0:没有股票  1：有股票)时手头的钱
     * 2. 状态转移
     * 如果未持有股票j=0, 那么就是前一天没有股票或者卖出股票 dp[i][0] = max(dp[i-1][0], dp[i-1][1] + prices[i])
     * 如果持有股票j=0, 那么就是前一天有股票 或者买入股票 dp[i][1] = max(dp[i-1][1], dp[i-1][0] - prices[i])
     * 3. 初始状态
     * dp[0][0] = 0;
     * dp[0][1] = -priices[0];
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[len-1][0];
    }
}
