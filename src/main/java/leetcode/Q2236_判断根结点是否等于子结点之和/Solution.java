/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q2236_判断根结点是否等于子结点之和;

/**
 * 类的描述
 * 给你一个 二叉树 的根结点 root，该二叉树由恰好 3 个结点组成：根结点、左子结点和右子结点。
 *
 * 如果根结点值等于两个子结点值之和，返回 true ，否则返回 false 。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/20
 **/
public class Solution {
    /**
     *
     * @param root
     * @return
     */
    public boolean checkTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        return root.val == root.left.val + root.right.val;
    }
}
