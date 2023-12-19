package leetcode.LC206;

import org.junit.jupiter.api.Test;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/19  9:46
 */
public class SolutionTest {

    @Test
    public void test1() {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        new Solution().reverseList(node1);

    }
}
