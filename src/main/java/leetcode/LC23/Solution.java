package leetcode.LC23;

import model.ListNode;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/12/21  9:02
 */
public class Solution {

    /**
     * 多路递归， 分而治之
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }

        return split(lists, 0, lists.length - 1);
    }

    private ListNode split(ListNode[] lists, int i, int j) {
        if(i == j) {
            return lists[i];
        }
        int m = (i + j) >>> 1;
        ListNode left = split(lists, i, m);
        ListNode right = split(lists, m+1, j);
        return mergeTwoLists(left, right);
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
