package leetcode.LC876;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/21  9:42
 */
public class Solution {

    /**
     * 快慢指针
     * 1 -> 2 -> null
     *
     * 1 -> 2 -> 3 -> 4 -> 5 -> null     3
     *
     * 1 -> 2 -> 3 -> 4 -> null
     *
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        if(head== null || head.next == null) {
            return head;
        }

        ListNode p1 = head, p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        return p1;
    }
}
