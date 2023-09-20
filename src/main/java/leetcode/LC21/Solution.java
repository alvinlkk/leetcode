package leetcode.LC21;

/**
 * <p>描 述：</p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/20  15:11
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        merge(ans, list1, list2);
        return ans.next;
    }

    private void merge(ListNode ans, ListNode list1, ListNode list2) {
        if(list1 == null) {
            ans.next = list2;
            return;
        }

        if(list2 == null) {
            ans.next = list1;
            return;
        }

        if(list1.val <= list2.val) {
            ans.next = list1;
            merge(ans.next, list1.next, list2);
        } else {
            ans.next = list2;
            merge(ans.next, list1, list2.next);
        }
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
