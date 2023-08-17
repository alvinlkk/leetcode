package leetcode.Q1342_将数字变成0的操作次数;

/**
 * <p>描 述：</p>
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/17  9:25
 */
public class Solution {
    public int numberOfSteps(int num) {
        // 定义状态 i变成0需要的步数
        int dp[] = new int[num + 1];

        // 初始状态
        dp[0] = 0;

        // 状态转移
        for(int i=1; i<=num; i++) {
            if(i % 2 == 0) {
                dp[i] = dp[i/2] + 1;
            } else {
                dp[i] = dp[i-1] + 1;
            }
        }
        return dp[num];
    }

    public int numberOfSteps1(int num) {
        int ret = 0;
        while (num > 0) {
            ret += (num > 1 ? 1 : 0) + (num & 0x01);
            num >>= 1;
        }
        return ret;
    }
}
