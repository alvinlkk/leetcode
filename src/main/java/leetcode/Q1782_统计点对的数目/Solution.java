package leetcode.Q1782_统计点对的数目;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>描 述：</p>
 * 给你一个无向图，无向图由整数 n  ，表示图中节点的数目，和 edges 组成，其中 edges[i] = [ui, vi] 表示 ui 和 vi 之间有一条无向边。同时给你一个代表查询的整数数组 queries 。
 * <p>
 * 第 j 个查询的答案是满足如下条件的点对 (a, b) 的数目：
 * <p>
 * a < b
 * cnt 是与 a 或者 b 相连的边的数目，且 cnt 严格大于 queries[j] 。
 * 请你返回一个数组 answers ，其中 answers.length == queries.length 且 answers[j] 是第 j 个查询的答案。
 * <p>
 * 请注意，图中可能会有 重复边 。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/23  9:37
 */
public class Solution {
    /**
     * @param n
     * @param edges
     * @param queries
     * @return
     */
    public int[] countPairs1(int n, int[][] edges, int[] queries) {
        int[] answers = new int[queries.length];
        for (int i = 1; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                // 统计点对 i, j 边的数量
                int cnt = calcEdgeCnt(i, j, edges);
                for (int k = 0; k < queries.length; k++) {
                    if (cnt > queries[k]) {
                        answers[k]++;
                    }
                }
            }
        }
        return answers;
    }

    private int calcEdgeCnt(int x, int y, int[][] edges) {
        int cnt = 0;
        for (int i = 0; i < edges.length; i++) {
            if (edges[i][0] == x && edges[i][1] == y
                    || edges[i][0] == y && edges[i][1] == x) {
                cnt++;
            } else if (edges[i][0] == x || edges[i][1] == x) {
                cnt++;
            } else if (edges[i][0] == y || edges[i][1] == y) {
                cnt++;
            }
        }
        return cnt;
    }

    public int[] countPairs(int n, int[][] edges, int[] queries) {
        // degree[i] 表示与点i连接边的数量
        int[] degree = new int[n + 1];
        // map 表示点对的数量
        Map<Integer, Integer> pointMap = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            degree[a]++;
            int b = edges[i][1];
            degree[b]++;

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            // 用一个 int 存储两个不超过 65535 的数
            pointMap.merge(a << 16 | b, 1, Integer::sum);
        }

        //排序degree
        int[] sortDegree = degree.clone();
        Arrays.sort(sortDegree);
        int[] answers = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];
            int left = 1, right = n;
            while (left < right) {
                if (sortDegree[left] + sortDegree[right] <= q) {
                    left++;
                } else {
                    answers[i] += right - left;
                    right--;
                }
            }

            // 去掉重复统计的数量
            for (Map.Entry<Integer, Integer> entry : pointMap.entrySet()) {
                int k = entry.getKey();
                int v = entry.getValue();
                int s = degree[k >> 16] + degree[k & 0xffff];
                if (s > q && s - v <= q) {
                    answers[i]--;
                }
            }
        }
        return answers;
    }

}
