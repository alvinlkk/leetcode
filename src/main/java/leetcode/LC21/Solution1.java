package leetcode.LC21;

import model.ListNode;

/**
 * <p>描 述：</p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0 
 * @since 2023/9/20  15:11
 */
public class Solution1 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode s = new ListNode(-1);
        ListNode p = s;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                p.next = list1;
                 list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1 != null) {
            p.next = list1;
        }
        if(list2 != null) {
            p.next = list2;
        }
        return s.next;
    }
}
