package leetcode.LC203;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/19  14:30
 */
public class Solution2 {

     /**
     * 递归的方式
      * 1->2->6->3->6->null
      *  removeElements(ListNode head=1, int val=6) {
      *      removeElements(ListNode head=2, int val=6) {
      *          removeElements(ListNode head=6, int val=6) {
      *              removeElements(ListNode head=3, int val=6) {
      *                  removeElements(ListNode head=6, int val=6) {
      *                      removeElements(ListNode head=null, int val=6) {
      *                           return null
      *                      }
      *                  }
      *              }
      *          }
      *      }
      *  }
      *
      *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }

        ListNode node = removeElements(head.next, val);
        if(head.val == val) {
            return node;
        } else {
            head.next = node;
            return head;
        }
    }
}
