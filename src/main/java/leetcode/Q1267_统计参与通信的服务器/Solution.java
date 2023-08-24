package leetcode.Q1267_统计参与通信的服务器;

/**
 * <p>描 述：</p>
 * 这里有一幅服务器分布图，服务器的位置标识在 m * n 的整数矩阵网格 grid 中，1 表示单元格上有服务器，0 表示没有。
 * <p>
 * 如果两台服务器位于同一行或者同一列，我们就认为它们之间可以进行通信。
 * <p>
 * 请你统计并返回能够与至少一台其他服务器进行通信的服务器的数量。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/24  9:39
 */
public class Solution {

    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // 每行为1的数量
        int[] rows = new int[m];
        // 每列为1的数量
        int[] cols = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    rows[i] ++;
                    cols[j] ++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1 && (rows[i] > 1 || cols[j] > 1)) {
                    ans ++;
                }
            }
        }
        return ans;
    }
}
