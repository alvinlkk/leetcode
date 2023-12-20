package leetcode.LC83;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/20  9:04
 */
public class Solution  {

    /**
     * 双指针
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        // 节点数< 2
        if(head == null || head.next == null) {
            return null;
        }

        // 节点数 >=2
        ListNode p1 = head;
        ListNode p2 = p1.next;

        while (p2 != null) {
            if(p1.val == p2.val) {
                // 删除p2
                p1.next = p2.next;
            } else {
                p1 = p2;
            }
            p2 = p2.next;
        }
        return head;
    }


    // 改进 （黑马）
    public ListNode deleteDuplicates1(ListNode head) {
        // 节点数< 2
        if(head == null || head.next == null) {
            return null;
        }

        // 节点数 >=2
        ListNode p1 = head;
        ListNode p2 = p1.next;

        while ((p2 = p1.next) != null) {
            if(p1.val == p2.val) {
                // 删除p2
                p1.next = p2.next;
            } else {
                // 向后平移
                p1 = p1.next ;
            }
        }
        return head;
    }
}
