package leetcode.LC901;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>描 述：</p>
 * 设计一个算法收集某些股票的每日报价，并返回该股票当日价格的 跨度 。
 *
 * 当日股票价格的 跨度 被定义为股票价格小于或等于今天价格的最大连续日数（从今天开始往回数，包括今天）。
 *
 * 例如，如果未来 7 天股票的价格是 [100,80,60,70,60,75,85]，那么股票跨度将是 [1,1,1,2,1,4,6] 。
 *
 * 实现 StockSpanner 类：
 *
 * StockSpanner() 初始化类对象。
 * int next(int price) 给出今天的股价 price ，返回该股票当日价格的 跨度 。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/10/7  18:51
 */
public class StockSpanner2 {

    private Deque<int[]> deque = new ArrayDeque<>();


    public StockSpanner2() {
    }

    public int next(int price) {
        int cnt = 1;
        while (!deque.isEmpty() && price >= deque.peek()[0]) {
            int[] pop = deque.pop();
            cnt += pop[1];
        }
        deque.push(new int[]{price, cnt});
        return cnt;
    }

}
