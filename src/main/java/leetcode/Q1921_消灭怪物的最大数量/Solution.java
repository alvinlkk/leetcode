/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q1921_消灭怪物的最大数量;

import java.util.Arrays;

/**
 * 类的描述
 * 你正在玩一款电子游戏，在游戏中你需要保护城市免受怪物侵袭。给你一个 下标从 0 开始 且长度为 n 的整数数组 dist ，其中 dist[i] 是第 i 个怪物与城市的 初始距离（单位：米）。
 * <p>
 * 怪物以 恒定 的速度走向城市。给你一个长度为 n 的整数数组 speed 表示每个怪物的速度，其中 speed[i] 是第 i 个怪物的速度（单位：米/分）。
 * <p>
 * 怪物从 第 0 分钟 时开始移动。你有一把武器，并可以 选择 在每一分钟的开始时使用，包括第 0 分钟。但是你无法在一分钟的中间使用武器。这种武器威力惊人，一次可以消灭任一还活着的怪物。
 * <p>
 * 一旦任一怪物到达城市，你就输掉了这场游戏。如果某个怪物 恰 在某一分钟开始时到达城市，这会被视为 输掉 游戏，在你可以使用武器之前，游戏就会结束。
 * <p>
 * 返回在你输掉游戏前可以消灭的怪物的 最大 数量。如果你可以在所有怪物到达城市前将它们全部消灭，返回  n 。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/3
 **/
public class Solution {

    /**
     * dist[i]
     * speed[i]
     * speed[i] * minute >= dist[i]
     *
     * @param dist
     * @param speed
     * @return
     */
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        // 花费的分钟数
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = dist[i] / speed[i] + (dist[i] % speed[i] == 0 ? 0 : 1);
        }
        Arrays.sort(cost);
        // 1, 2, 3,3, 5, 7, 9
        for(int minute=1; minute<n; minute++) {
            if(cost[minute] <= minute) {
                return minute;
            }
        }
        return n;
    }
}
