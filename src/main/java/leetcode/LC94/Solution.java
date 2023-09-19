/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC94;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/2
 **/
public class Solution {

    /**
     * 中序遍历  左 - 中 - 右
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // 左子树
        dfs(node.left, result);
        result.add(node.val);
        // 右子树
        dfs(node.right, result);
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
