package Q2两数之和;

import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/7/25  19:58
 */
public class SolutionTest {

    @Test
    public void test1() {
        ListNode nodeA = new ListNode(0);
        ListNode nodeB = new ListNode(0);
        Solution1 solution = new Solution1();
        ListNode listNode = solution.addTwoNumbers(nodeA, nodeB);
        System.out.println(listNode);
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode nodeA = new ListNode(5);
        ListNode nodeB = new ListNode(6);
        ListNode nodeC = new ListNode(4);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        Solution1 solution = new Solution1();
        ListNode listNode = solution.addTwoNumbers(node1, nodeA);
        System.out.println(listNode);
    }

    @Test
    public void test3() {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode nodeA = new ListNode(9);
        ListNode nodeB = new ListNode(9);
        ListNode nodeC = new ListNode(9);
        ListNode nodeD = new ListNode(9);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        Solution1 solution = new Solution1();
        ListNode listNode = solution.addTwoNumbers(node1, nodeA);
        System.out.println(listNode);
    }

    @Test
    public void test4() {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode nodeA = new ListNode(9);
        ListNode nodeB = new ListNode(9);
        ListNode nodeC = new ListNode(9);
        ListNode nodeD = new ListNode(9);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        Solution1 solution = new Solution1();
        ListNode listNode = solution.addTwoNumbers(nodeA, node1);
        System.out.println(listNode);
    }
}
