/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q228_汇总区间;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的描述
 * 给定一个  无重复元素 的 有序 整数数组 nums 。
 * <p>
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表 。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 * <p>
 * 列表中的每个区间范围 [a,b] 应该按如下格式输出：
 * <p>
 * "a->b" ，如果 a != b
 * "a" ，如果 a == b
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/26
 **/
public class Solution {

    public List<String> summaryRanges1(int[] nums) {
        List<String> res = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            res.add(nums[0] + "");
            return res;
        }

        int i = 0;
        int j = i + 1;
        int temp = nums[0];
        while (j < len) {
            // 判断是否连续
            if (temp + 1 != nums[j]) {
                if (j - i > 1) {
                    res.add(nums[i] + "->" + nums[j - 1]);
                } else {
                    res.add(nums[i] + "");
                }

                i = j;
            }
            temp = nums[j];
            j++;

        }

        if (j - i > 1) {
            res.add(nums[i] + "->" + nums[j - 1]);
        } else {
            res.add(nums[i] + "");
        }
        return res;
    }


    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int len = nums.length;
        for (int i = 0, j = i + 1; j <= len; j++) {
            int d = j - i;
            if (j == len || nums[i] + d < nums[j]) {
                if (d > 1) {
                    res.add(nums[i] + "->" + nums[j - 1]);
                } else {
                    res.add(nums[i] + "");
                }
                i = j;
            }
        }
        return res;
    }
}
