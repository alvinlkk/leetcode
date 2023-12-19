package leetcode.LC203;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/19  14:30
 */
public class Solution {

    /**
     * 迭代的方式
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummpy = new ListNode();
        dummpy.next = head;

        ListNode pre = dummpy;
        ListNode curr = dummpy.next;
        while (curr != null) {
            if(curr.val == val) {
                pre.next = curr.next;
            } else {
                pre = curr;
            }
            curr = curr.next;
        }
        return dummpy.next;
    }
}
