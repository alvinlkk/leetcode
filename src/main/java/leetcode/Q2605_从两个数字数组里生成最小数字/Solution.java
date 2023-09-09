package leetcode.Q2605_从两个数字数组里生成最小数字;

import java.util.Arrays;

/**
 * <p>描 述：</p>
 * 给你两个只包含 1 到 9 之间数字的数组 nums1 和 nums2 ，每个数组中的元素 互不相同 ，请你返回 最小 的数字，两个数组都 至少 包含这个数字的某个数位。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/5  9:26
 */
public class Solution {

    /**
     * 排序
     * 1. 二分查找数值相同的，找到就返回
     * 2. 两位数判断
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i=0; i<nums1.length; i++) {
            int index = Arrays.binarySearch(nums2, nums1[i]);
            if(index>=0) {
                return nums1[i];
            }
        }
        int a = Math.min(nums1[0], nums2[0]);
        int b = Math.max(nums1[0], nums2[0]);
        return a * 10 + b;
    }
}
