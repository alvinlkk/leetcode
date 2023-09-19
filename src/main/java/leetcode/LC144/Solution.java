/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 类的描述
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/2
 **/
public class Solution {

    /**
     * 前序遍历， 中 -> 左 -> 右
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> result =new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> result) {
        if(node == null) {
            return;
        }
        result.add(node.val);
        // 左子树
        dfs(node.left, result);
        // 右子树
        dfs(node.right, result);
    }

    /**
     * 采用迭代的方式，使用stack数据结构
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result =new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            if(curr != null) {
                result.add(curr.val);
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode pop = stack.pop();
                curr = pop.right;
            }
        }
        return result;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
