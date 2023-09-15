package leetcode.Q2596_检查骑士巡视方案;

/**
 * <p>描 述：</p>
 * 骑士在一张 n x n 的棋盘上巡视。在有效的巡视方案中，骑士会从棋盘的 左上角 出发，并且访问棋盘上的每个格子 恰好一次 。
 *
 * 给你一个 n x n 的整数矩阵 grid ，由范围 [0, n * n - 1] 内的不同整数组成，其中 grid[row][col] 表示单元格 (row, col) 是骑士访问的第 grid[row][col] 个单元格。骑士的行动是从下标 0 开始的。
 *
 * 如果 grid 表示了骑士的有效巡视方案，返回 true；否则返回 false。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/13  10:04
 */
public class Solution {

    /**
     * 1. 将n * n棋盘转为另一个数组， arr[n*n-1][2] index表示步， 数组值表示在棋盘中的位置
     * 2. 计算8种可能的位置，看看下一个位置是否在这个位置组中
     *
     *
     * @param grid
     * @return
     */
    public boolean checkValidGrid(int[][] grid) {
        return false;
    }


}

