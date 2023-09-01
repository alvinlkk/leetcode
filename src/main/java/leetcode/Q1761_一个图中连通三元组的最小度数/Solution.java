package leetcode.Q1761_一个图中连通三元组的最小度数;

/**
 * <p>描 述：</p>
 * 给你一个无向图，整数 n 表示图中节点的数目，edges 数组表示图中的边，其中 edges[i] = [ui, vi] ，表示 ui 和 vi 之间有一条无向边。
 * <p>
 * 一个 连通三元组 指的是 三个 节点组成的集合且这三个点之间 两两 有边。
 * <p>
 * 连通三元组的度数 是所有满足此条件的边的数目：一个顶点在这个三元组内，而另一个顶点不在这个三元组内。
 * <p>
 * 请你返回所有连通三元组中度数的 最小值 ，如果图中没有连通三元组，那么返回 -1 。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/31  12:56
 */
public class Solution {
    /**
     * 1. 如何找到一个三元组？  x-y y-z z-x 使用一个邻接矩阵， xy=1, yz=1, zx=1表示三元组
     * 2. 如何计算度？ 就是到3个顶点的边，减去自身的度2*3 degree[x] + degree[y] + degree[z] - 6
     *
     * @param n
     * @param edges
     * @return
     */
    public int minTrioDegree(int n, int[][] edges) {
        int minDeg = Integer.MAX_VALUE;

        int[][] aa = new int[n + 1][n + 1];
        int[] degree = new int[n + 1];
        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            aa[node1][node2] = 1;
            aa[node2][node1] = 1;

            degree[node1]++;
            degree[node2]++;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if(aa[i][j] == 1) {
                    for (int k = j + 1; k <= n; k++) {
                        if(aa[i][k] == 1 && aa[j][k] == 1) {
                            minDeg = Math.min(minDeg, degree[i] + degree[j] + degree[k] - 6);
                        }
                    }
                }
            }
        }
        return minDeg == Integer.MAX_VALUE ? -1 : minDeg;
    }
}
