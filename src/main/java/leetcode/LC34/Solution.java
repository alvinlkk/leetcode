/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC34;

/**
 * 类的描述
 * <p>
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * <p>
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/9
 **/
public class Solution {
    /**
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left >= nums.length || nums[left] != target) {
            return new int[]{-1, -1};
        }
        int from = left;
        right = nums.length - 1;
        // 1,2,3
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int to = right;
        return new int[]{from, to};
    }
}
