package leetcode.Q35_搜索插入位置;

/**
 * <p>描 述：</p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/8  13:28
 */
public class Solution {

    /**
     * 二分法查找，但是查找不到不返回-1
     * 返回的是left + 1
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            } else {
                return mid;
            }
        }
        return left + 1;
    }
}
