package leetcode.Q1448_统计二叉树中好节点的数目;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>描 述：</p>
 * 给你一棵根为 root 的二叉树，请你返回二叉树中好节点的数目。
 * <p>
 * 「好节点」X 定义为：从根到该节点 X 所经过的节点中，没有任何节点的值大于 X 的值。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/25  9:39
 */
public class Solution {
    Map<TreeNode, Boolean> nodeMap = new HashMap<>();

    /**
     * 使用栈的思想把
     * <p>
     * by alvin
     *
     * @param root
     * @return
     */
    public int goodNodes1(TreeNode root) {
        Deque<TreeNode> treeNodeDeque = new ArrayDeque<>();
        putNode(root, treeNodeDeque);

        int cnt = 0;
        for (Boolean bool : nodeMap.values()) {
            if (bool) {
                cnt++;
            }
        }
        return cnt;
    }

    void putNode(TreeNode treeNode, Deque<TreeNode> deque) {
        // 遍历deque，判断是否大于堆里的全部元素
        boolean good = true;
        for (TreeNode node : deque) {
            boolean beforeNode = nodeMap.getOrDefault(node, false);
            if (beforeNode && treeNode.val >= node.val) {
                break;
            } else if (treeNode.val < node.val) {
                good = false;
                break;
            }
        }
        nodeMap.put(treeNode, good);
        deque.push(treeNode);
        // 左边节点
        if (treeNode.left != null) {
            putNode(treeNode.left, deque);
        }
        // 右边节点
        if (treeNode.right != null) {
            putNode(treeNode.right, deque);
        }
        // 弹出顶端数据
        deque.pop();
    }

    /**
     * 深度优先遍历
     * 只要遍历到的节点大于等于路径中的最大值，那么就是好节点，结果++
     *
     * @param root
     * @return
     */
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    public int dfs(TreeNode node, int pathMax) {
        if (node == null) {
            return 0;
        }
        int ans = 0;
        if (node.val >= pathMax) {
            ans++;
            pathMax = node.val;
        }
        // 遍历左子树
        ans += dfs(node.left, pathMax);
        // 遍历又子树
        ans += dfs(node.right, pathMax);
        return ans;
    }


}
