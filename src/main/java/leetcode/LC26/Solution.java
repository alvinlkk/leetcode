package leetcode.LC26;

/**
 * <p>描 述：</p>
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 *
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 *
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
 * 返回 k 。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/22  19:21
 */
public class Solution {

    /**
     * 思路：
     *
     *
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int pre = nums[0];
        int step = 0;
        for(int i=1; i<len; i++) {
            if(nums[i] == pre) {
                step++;
            } else {
                nums[i-step] = nums[i];
                pre = nums[i];
            }
        }
        return len - step;
    }
}
