/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q207_课程表;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 类的描述
 * 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
 * <p>
 * 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
 * <p>
 * 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
 * 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/9
 **/
public class Solution1 {
    // 每个顶点的边
    private List<Integer>[] edges;
    // 每个边的入度
    private int[] inDegrees;

    /**
     * 问题抽象为如果prerequisites存在环形结构，说明就无法完成。
     * 图 拓扑结构
     * 广度优先排序
     *
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edges[i] = new ArrayList<>();
        }
        inDegrees = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int from = prerequisites[i][1];
            int to = prerequisites[i][0];
            // 添加顶点的入度
            edges[from].add(to);
            // 入度
            inDegrees[to] ++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            // 如果入度为0，添加到队列中
            if(inDegrees[i] == 0) {
                queue.offer(i);
            }
        }

        int ans = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            ans ++;
            for (Integer ele : edges[node]) {
                inDegrees[ele] --;
                if(inDegrees[ele] == 0) {
                    queue.offer(ele);
                }
            }
        }
        return ans == numCourses;
    }


}
