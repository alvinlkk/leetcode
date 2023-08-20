/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q1043_分隔数组以得到最大和;

/**
 * 类的描述
 * 给你一个整数数组 arr，请你将该数组分隔为长度 最多 为 k 的一些（连续）子数组。分隔完成后，
 * 每个子数组的中的所有值都会变为该子数组中的最大值。
 *
 * 返回将数组分隔变换后能够得到的元素最大和。本题所用到的测试用例会确保答案是一个 32 位整数。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/20
 **/
public class Solution {
    /**
     * 1. 状态 dp[i] 最大和
     * 2. 状态方程
     *   1). k == 1， dp[i] = dp[i-1] + arr[i-1]
     *   2). k == 2,  dp[i] = dp[i-2] + k * max(arr[i-1], arr[i-2])
     *   3). ....
     *   一直到k为止，
     *   求出上面几组中的最大值，就是dp[i]的值
     * 3. 初始状态 dp[0] = nums[0]
     * @param arr
     * @param k
     * @return
     */
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int length = arr.length;
        int[] dp = new int[length + 1];
        dp[0] = 0;
        for(int i=1; i<=length; i++) {
            for(int j=1; j<=k && i>=j; j++) {
                // arr[i] ~ arr[i-j] 中最大值
                int max = 0;
                for(int z=1; z<=j; z++) {
                   max = Math.max(arr[i-z], max);
                }
                dp[i] = Math.max(dp[i], dp[i-j] + j * max);
            }
        }
        return dp[length];
    }
}
