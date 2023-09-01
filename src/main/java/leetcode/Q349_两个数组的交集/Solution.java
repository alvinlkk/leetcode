/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q349_两个数组的交集;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 类的描述
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。
 * 输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/28
 **/
public class Solution {

    /**
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }
        
        int[] arr = new int[res.size()];
        int index = 0;
        for (Integer re : res) {
            arr[index] = re;
            index ++;
        }
        return arr;
    }
}
