package leetcode.Q1448_统计二叉树中好节点的数目;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/25  13:01
 */
public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode();
        root.val = 2;
        TreeNode node1 = new TreeNode();
        node1.val = 1;
        root.left = node1;
        TreeNode node3 = new TreeNode();
        node3.val = 3;
        node1.left = node3;
        TreeNode node2 = new TreeNode();
        node2.val = 4;
        root.right = node2;
        TreeNode node4 = new TreeNode();
        node4.val = 1;
        node2.right = node4;
        TreeNode node5 = new TreeNode();
        node5.val = 5;
        node2.right = node5;

        int cnt = solution.goodNodes(root);
        Assertions.assertEquals(cnt, 4);


    }
}
