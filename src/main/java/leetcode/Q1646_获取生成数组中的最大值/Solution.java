/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q1646_获取生成数组中的最大值;

import java.util.Arrays;

/**
 * 类的描述
 * 给你一个整数 n 。按下述规则生成一个长度为 n + 1 的数组 nums ：
 * <p>
 * nums[0] = 0
 * nums[1] = 1
 * 当 2 <= 2 * i <= n 时，nums[2 * i] = nums[i]
 * 当 2 <= 2 * i + 1 <= n 时，nums[2 * i + 1] = nums[i] + nums[i + 1]
 * 返回生成数组 nums 中的 最大 值。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/20
 **/
public class Solution {

    /**
     * 1. 定义状态
     * int[] dp：表示第i个数中的最大值
     * 2. 状态转移
     * dp[i] = dp[i-1]
     *
     * @param n
     * @return
     */
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int max = 1;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            if(i % 2 == 0) {
                nums[i] = nums[i/2];
            } else {
                int div = i/2;
                nums[i] = nums[div] + nums[div + 1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public int getMaximumGenerated1(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];
        nums[1] = 1;
        for (int i = 2; i <= n; ++i) {
            nums[i] = nums[i / 2] + i % 2 * nums[i / 2 + 1];
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}
