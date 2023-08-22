package leetcode.Q849_到最近的人的最大距离;

import java.util.Arrays;

/**
 * <p>描 述：</p>
 * 给你一个数组 seats 表示一排座位，其中 seats[i] = 1 代表有人坐在第 i 个座位上，seats[i] = 0 代表座位 i 上是空的（下标从 0 开始）。
 * <p>
 * 至少有一个空座位，且至少有一人已经坐在座位上。
 * <p>
 * 亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
 * <p>
 * 返回他到离他最近的人的最大距离。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/22  9:43
 */
public class Solution {

    /**
     * 分成三部分
     * 1. 最前面一部分
     * 2. 最后面一部分
     * 3. 两个位置中间部分
     *
     * @param seats
     * @return
     */
    public int maxDistToClosest1(int[] seats) {
        int len = seats.length;
        int first = -1;
        int last = -1;
        // 两个座位之间最大值
        int maxDistantce = 0;
        for (int i = 0; i < len; i++) {
            int seat = seats[i];
            if (seat == 1) {
                if (first == -1) {
                    first = i;
                }

                if (last != -1) {
                    maxDistantce = Math.max(maxDistantce, i - last);
                }
                last = i;
            }
        }
        return Math.max(maxDistantce / 2, Math.max(first, len - last - 1));
    }

    public int maxDistToClosest(int[] seats) {
        int max = 0, l = 0, r = 0;
        while (l < seats.length && seats[l] == 0) {
            l++;
        }
        max = l;
        while (l < seats.length) {
            r = l + 1;
            while (r < seats.length && seats[r] == 0) {
                ++ r;
            }
            if (r == seats.length) {
                max = Math.max(max, r - l - 1);
            } else {
                max = Math.max(max, (r - l) / 2);
            }
            l = r;
        }
        return max;
    }

}
