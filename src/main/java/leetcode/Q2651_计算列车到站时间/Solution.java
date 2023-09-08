package leetcode.Q2651_计算列车到站时间;

/**
 * <p>描 述：</p>
 * 给你一个正整数 arrivalTime 表示列车正点到站的时间（单位：小时），另给你一个正整数 delayedTime 表示列车延误的小时数。
 *
 * 返回列车实际到站的时间。
 *
 * 注意，该问题中的时间采用 24 小时制。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/8  9:38
 */
public class Solution {

    /**
     * 太简单了把 hhhh
     * @param arrivalTime
     * @param delayedTime
     * @return
     */
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
