package leetcode.LC206;

import model.ListNode;

/**
 * <p>描 述：</p>
 * https://leetcode.cn/problems/reverse-linked-list/description/
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/19  9:30
 */
public class Solution2 {

    /**
     * 采用递归的方式
     * 1 -> 2 -> 3
     * return reverseList（1）{
     *      return reverseList（2） {
     *           return reverseList（3） {
     *              if( head.next == null) {
     *                  return head;
     *              }
     *           }
     *           head.next.next = head;
     *           head.next =null;
     *      }
     *       head.next.next = head;
     *       head.next =null;
     * }
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

}
