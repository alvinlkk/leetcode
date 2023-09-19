/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 类的描述
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/27
 **/
public class Solution {

    /**
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        int[][] ans = new int[intervals.length][2];
        // 排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int index = 0;
        for (int i = 0; i < intervals.length; i++) {
            int start1 = intervals[i][0];
            int end1 = intervals[i][1];
            int j = i + 1;
            while (j < intervals.length) {
                int start2 = intervals[j][0];
                int end2 = intervals[j][1];
                // can merge
                if (end1 >= start2) {
                    end1 = Math.max(end1, end2);
                } else {
                    break;
                }
                j++;
            }
            ans[index] = new int[]{start1, end1};
            index++;
            i = j - 1;
        }

        return Arrays.copyOf(ans, index);
    }

    /**
     * @param intervals
     * @return
     */
    public int[][] merge2(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        // 排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(ans.size() == 0 || ans.get(ans.size() - 1)[1] < start) {
                ans.add(new int[]{start, end});
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() -1)[1], end);
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}
