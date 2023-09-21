package offer.Q10_青蛙跳台阶问题;

import java.util.Arrays;
import java.util.Objects;

/**
 * <p>描 述：</p>
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 * 输入：n = 2
 * 输出：2
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/16  9:43
 */
public class Solution {
    /**
     * 动态规划算法
     * 1. 定义状态
     * dp[i] 表示跳上第i级台阶所需的跳法
     * <p>
     * 2.状态转移方程
     * dp[i] = dp[i-1] + dp[i-2]
     * <p>
     * 3.初始条件
     * i=0, dp[i] = 0
     * i=1, dp[i] = 1
     * <p>
     * 4. 转移方向
     * 从左——>右
     *
     * @param n
     * @return
     */
    public int numWays(int n) {
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
            if(dp[i] > 1000000007) {
                dp[i] = dp[i] % 1000000007;
            }
        }
        return dp[n];
    }
}
