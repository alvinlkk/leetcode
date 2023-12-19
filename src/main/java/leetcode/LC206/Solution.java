package leetcode.LC206;

import java.util.List;

import model.ListNode;

/**
 * <p>描 述：</p>
 * https://leetcode.cn/problems/reverse-linked-list/description/
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/19  9:30
 */
public class Solution {

    /**
     * 采用迭代的方式
     *  1->2->3->4->5
     *  a. 1 2->3->4->5
     *  b. 2->1 3->4->5
     *  ...
     *  4->3->2->1 5
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

}
