/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q283_移动零;

/**
 * 类的描述
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/28
 **/
public class Solution {

    public void moveZeroes(int[] nums) {
        int len = nums.length;

        int j =0;
        for(int i=0; i<len; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for(int i=j; i<len; i++) {
            nums[i] = 0;
        }
    }
}
