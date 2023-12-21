package leetcode.LC82;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/20  13:22
 */
public class Solution {

    /**
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode s = new ListNode(-1, head);
        ListNode p1 = s;
        ListNode p2, p3;
        while ((p2 = p1.next) != null && (p3 = p2.next) != null) {
            if (p3.val == p2.val) {
                while ((p3 = p3.next) != null && p3.val == p2.val) {

                }
                p1.next = p3;
            } else {
                p1 = p2;
            }
        }

        return s.next;
    }
}
