package leetcode.Q2594_修车的最少时间;

import java.util.Arrays;

/**
 * <p>描 述：</p>
 * 给你一个整数数组 ranks ，表示一些机械工的 能力值 。ranksi 是第 i 位机械工的能力值。能力值为 r 的机械工可以在 r * n2 分钟内修好 n 辆车。
 * <p>
 * 同时给你一个整数 cars ，表示总共需要修理的汽车数目。
 * <p>
 * 请你返回修理所有汽车 最少 需要多少时间。
 * <p>
 * 注意：所有机械工可以同时修理汽车。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/7  9:39
 */
public class Solution {

    /**
     *
     * @param ranks
     * @param cars
     * @return
     */
    public long repairCars(int[] ranks, int cars) {
        // high必须要加1L，不然两个很大cars相乘int存不下
        long low = 0, high = 1L * ranks[0] * cars * cars;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            long fixedCars = 0;
            for (int rank : ranks) {
                fixedCars += (long)Math.sqrt(mid / rank);
            }
            // 时间满足条件
            if(fixedCars >= cars) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int a = 292126 * 292126;
        System.out.println(a);
    }
}
