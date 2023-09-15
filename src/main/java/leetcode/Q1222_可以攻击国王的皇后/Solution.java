package leetcode.Q1222_可以攻击国王的皇后;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>描 述：</p>
 * 在一个 8x8 的棋盘上，放置着若干「黑皇后」和一个「白国王」。
 * <p>
 * 给定一个由整数坐标组成的数组 queens ，表示黑皇后的位置；以及一对坐标 king ，表示白国王的位置，返回所有可以攻击国王的皇后的坐标(任意顺序)。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/14  11:02
 */
public class Solution {

    /**
     *
     *
     * @param queens
     * @param king
     * @return
     */
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>(8);
        int[][] grid = new int[8][8];
        for (int i = 0; i < queens.length; i++) {
            grid[queens[i][0]][queens[i][1]] = 1;
        }

        int x = king[0];
        int y = king[1];
        // 8个方向遍历
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }

                int newX = x + i;
                int newY = y + j;
                while (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                    if(grid[newX][newY] == 1) {
                        List<Integer> pos = new ArrayList<>(2);
                        pos.add(newX);
                        pos.add(newY);
                        ans.add(pos);
                        break;
                    }
                    newX = newX + i;
                    newY = newY + j;
                }
            }
        }
        return ans;
    }
}
