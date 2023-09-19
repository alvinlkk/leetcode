/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC57;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的描述
 * 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
 * <p>
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/28
 **/
public class Solution {

    /**
     * - intervals是排序的
     * - 用一个List<int[]> 接受结果
     * - 不重叠情况
     * 1. left2 > right1
     * 2. right2 < left1
     *
     * @param intervals
     * @param newInterval
     * @return
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int len = intervals.length;
        int index = 0;
        // 如果新区间最小值比区间数据最大值大，直接添加区间数据
        while (index < len && newInterval[0] > intervals[index][1]) {
            ans.add(intervals[index]);
            index ++;
        }

        // 如果新区间最大值大于区间元素左边值，有重叠
        while (index < len && newInterval[1] >= intervals[index][0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
            index ++;
        }
        ans.add(newInterval);

        // 如果新区间右边值小于最小值
        while (index < len && newInterval[1] < intervals[index][0]) {
            ans.add(intervals[index]);
            index ++;
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}
