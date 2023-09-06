package leetcode.Q1123_最深叶节点的最近公共祖先;/**
* <p>描 述：</p>
 * 给你一个有根节点 root 的二叉树，返回它 最深的叶节点的最近公共祖先 。
 *
 * 回想一下：
 *
 * 叶节点 是二叉树中没有子节点的节点
 * 树的根节点的 深度 为 0，如果某一节点的深度为 d，那它的子节点的深度就是 d+1
 * 如果我们假定 A 是一组节点 S 的 最近公共祖先，S 中的每个节点都在以 A 为根节点的子树中，且 A 的深度达到此条件下可能的最大值。
*
* @author cxw (332059317@qq.com)
* @since 2023/9/6  9:36
* @version 1.0.0
*/public class Solution {

    /**
     * 1. 找到深度最深的节点，可能1个或者多个
     * 2. 如果是1个的话，直接返回
     * 3. 如果>=1个的话，找到父节点
     * @param root
     * @return
     */
    public TreeNode lcaDeepestLeaves(TreeNode root) {

        return null;

    }
}
