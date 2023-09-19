/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC136;

import java.util.Arrays;

/**
 * 类的描述
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/28
 **/
public class Solution {

    /**
     * 1. 排序
     * 2. 双指针
     * @param nums
     * @return
     *
     * by alvin
     */
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int pos = 0;
        int index = 0;
        while (index<nums.length) {
            while (index<nums.length && nums[index] == nums[pos]) {
                index ++;
            }
            if(index - pos == 1) {
                return nums[pos];
            }
            pos = index;
        }
        return nums[pos];
    }

    /**
     * 异或操作 1^1=0  1^0=1 0^0=0
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }
}
