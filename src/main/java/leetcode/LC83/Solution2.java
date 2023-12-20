package leetcode.LC83;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/20  9:04
 */
public class Solution2 {

    /**
     * 递归 alvin
     *
     * deleteDuplicates(ListNode p=1) {
     *     deleteDuplicates(ListNode p=1) {
     *         deleteDuplicates(ListNode p=1) {
     *             deleteDuplicates(ListNode p=null) {
     *                 return null
     *             }
     *             return p=1
     *         }
     *         if(判断内存返回的节点和当前节点一样) {
     *              删除节点
     *         }
     *     }
     * }
     *
     * @param head
     * @return
     */
     public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode recNode = deleteDuplicates(head.next);
        if(recNode != null && head.val == recNode.val) {
            head.next = recNode.next;
        }
        return head;
    }

    // by heima
    public ListNode deleteDuplicates2(ListNode p) {
        if(p == null || p.next == null) {
            return null;
        }

        if(p.val == p.next.val) {
            // 若我与next重复，返回next
            return deleteDuplicates2(p.next);
        } else {
            // 若我与next不重复，返回我，更新next
            p.next = deleteDuplicates(p.next);
            return p;
        }
    }
}
