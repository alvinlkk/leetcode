/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q2240_买钢笔和铅笔的方案数;

/**
 * 类的描述
 * 给你一个整数 total ，表示你拥有的总钱数。同时给你两个整数 cost1 和 cost2 ，分别表示一支钢笔和一支铅笔的价格。你可以花费你部分或者全部的钱，去买任意数目的两种笔。
 *
 * 请你返回购买钢笔和铅笔的 不同方案数目 。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/1
 **/
public class Solution {

    /**
     * 钢笔数量：x, 铅笔数量：y
     * x * cost1 + y * cost2 < total
     *
     * @param total
     * @param cost1
     * @param cost2
     * @return
     */
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ways = 0;
        int count1 = 0;
        int maxCount1 = total / cost1;
        while (count1 <= maxCount1) {
            int totalCost1 = count1 * cost1;
            int maxCount2 = (total - totalCost1) / cost2 + 1;
            ways += maxCount2;
            count1 ++;
        }
        return ways;
    }
}
