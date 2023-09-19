/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC207;

import java.util.ArrayList;
import java.util.List;

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
public class Solution {
    // 每个顶点的边
    private List<Integer>[] edges;
    // 每个定点的状态，0-未访问  1-访问中 2-成功
    private int[] courseStatus;
    // 是否有效
    private boolean isValid = true;

    /**
     * 问题抽象为如果prerequisites存在环形结构，说明就无法完成。
     * 图 拓扑结构
     *
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 每个课程的边, index表示课程，edges[i]表示每个课程关联的边
        edges = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int from = prerequisites[i][1];
            int to = prerequisites[i][0];
            // 添加边
            edges[from].add(to);
        }
        courseStatus = new int[numCourses];
        // 如果是有效，遍历每个顶点
        for (int i = 0; i < numCourses && isValid; i++) {
            // 表示没有搜索过
            if (courseStatus[i] == 0) {
                dfs(i);
            }
        }
        return isValid;
    }

    // 深度优先遍历
    private void dfs(int node) {
        courseStatus[node] = 1;
        // 遍历顶点的每条边关联的顶点
        for (Integer edge : edges[node]) {
            //  如果没有访问过，继续访问
            if (courseStatus[edge] == 0) {
                dfs(edge);
                // 如果访问中状态，再次访问，那么就是无效
            } else if (courseStatus[edge] == 1) {
                isValid = false;
            }
        }
        // 设置课程状态2，表示成功，无需在进行访问了
        courseStatus[node] = 2;
    }
}
