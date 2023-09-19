package leetcode.LC217;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>描 述：</p>
 *给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/24  21:03
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
