package leetcode.LC19;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/19  20:01
 */
public class Solution {

    /**
     *  recursion(ListNode head=1, int n=2) {
     *     recursion(ListNode head=2, int n=2) {
     *         recursion(ListNode head=3, int n=2) {
     *             recursion(ListNode head=4, int n=2) {
     *                 recursion(ListNode head=5, int n=2) {
     *                       recursion(ListNode head=null, int n=2) {
     *                           return 0;
     *                       }
     *                       return 1;
     *                 }
     *                 return 2;
     *             }
     *             if(返回值== n) {
     *                 head.next =head.next.next;
     *             }
     *         }
     *     }
     * }
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 哨兵节点
        ListNode emptyNode = new ListNode();
        emptyNode.next = head;
        recursion(emptyNode, n);
        return emptyNode.next;
    }

    private int recursion(ListNode node, int n) {
        if(node == null) {
            return 0;
        }

        int recursion = recursion(node.next, n);
        // 删除节点
        if(recursion == n) {
            node.next = node.next.next;
        }
        return recursion + 1;
    }
}
