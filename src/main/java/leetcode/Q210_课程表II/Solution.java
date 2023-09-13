/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q210_课程表II;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 类的描述
 * 现在你总共有 numCourses 门课需要选，记为 0 到 numCourses - 1。给你一个数组 prerequisites ，其中 prerequisites[i] = [ai, bi] ，表示在选修课程 ai 前 必须 先选修 bi 。
 *
 * 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示：[0,1] 。
 * 返回你为了学完所有课程所安排的学习顺序。可能会有多个正确的顺序，你只要返回 任意一种 就可以了。如果不可能完成所有课程，返回 一个空数组 。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/10
 **/
public class Solution {
    private List<Integer>[] edges;
    
    private boolean isValid = true;
    
    private int[] visited;

    /**
     * 深度优先 & 广度优先
     *
     *
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        visited = new int[numCourses];
        edges = new ArrayList[numCourses];
        for (int i=0; i<numCourses; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int[] prerequisite : prerequisites) {
            int from = prerequisite[1];
            int to = prerequisite[0];
            edges[from].add(to);
        }

        Stack<Integer> stack = new Stack();
        for (int i = 0; i < numCourses && isValid; i++) {
            if(visited[i] == 0) {
                dfs(i, stack);
            }
        }

        if(!isValid) {
            return new int[]{};
        }
        int[] res = new int[numCourses];
        for (int i=0; i<numCourses; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    private void dfs(Integer node, Stack stack) {
        // 设置节点为访问中状态
        visited[node] = 1;
        List<Integer> edgeNodes = edges[node];
        for (Integer edgeNode : edgeNodes) {
            // 如果没有访问过，递归访问
            if(visited[edgeNode] == 0)  {
                dfs(edgeNode, stack);
            // 如果已经被访问过了，再次访问，说明存在环，直接返回
            } else if (visited[edgeNode] == 1) {
                isValid = false;
                return;
            }
        }
        // 表示访问成功
        visited[node] = 2;
        // 压入栈中
        stack.push(node);
    }
}
