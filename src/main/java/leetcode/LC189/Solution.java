package leetcode.LC189;

/**
 * <p>描 述：</p>
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/24  20:21
 */
public class Solution {

    /**
     * 1. 对k取模： k=k%nums.length
     * 2. nums[(i + k) % length] = nums[i]
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % nums.length;
        // temp暂存后面被移走的数据
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[length - k + i];
        }

        for (int i = length - 1; i >= 0; i--) {
            if (i - k >= 0) {
                nums[i] = nums[i - k];
            } else {
                nums[i] = temp[i];
            }
        }
    }
}
