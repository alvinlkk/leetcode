package leetcode.LC82;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/20  13:22
 */
public class Solution2 {

    /**
     * 递归的方式
     * deleteDuplicates(node = 1) {
     *     deleteDuplicates(node = 2) {
     *         deleteDuplicates(node = 3) {
     *             deleteDuplicates(node = 3) {
     *
     *                 deleteDuplicates(node = 4) {
     *                     deleteDuplicates(node = 4) {
     *                         deleteDuplicates(node = 5) {
     *                             return node(5)
     *                         }
     *
     *
     *                     }
     *                 }
     *             }
     *         }
     *     }
     * }
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        if(head.val == head.next.val) {
            ListNode x = head.next.next;
            while (x != null && x.val == head.val) {
                x = x.next;
            }
            return deleteDuplicates(head);
        } else {
            head.next = deleteDuplicates(head.next);
            return head;
        }

    }
}
