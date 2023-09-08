package leetcode.Q2594_修车的最少时间;

/**
 * <p>描 述：</p>
 * 给你一个整数数组 ranks ，表示一些机械工的 能力值 。ranksi 是第 i 位机械工的能力值。能力值为 r 的机械工可以在 r * n2 分钟内修好 n 辆车。
 *
 * 同时给你一个整数 cars ，表示总共需要修理的汽车数目。
 *
 * 请你返回修理所有汽车 最少 需要多少时间。
 *
 * 注意：所有机械工可以同时修理汽车。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/7  9:39
 */
public class Solution {

    /**
     * ranks[i]越小，修车数越多比较好
     * 二分查找？ 查什么呢
     * n * n * r <= t
     *
     * @param ranks
     * @param cars
     * @return
     */
    public long repairCars(int[] ranks, int cars) {
        return 0;
    }
}
