package Q2两数之和;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/7/25  19:54
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
// https://leetcode.cn/problems/add-two-numbers/solutions/2327008/dong-hua-jian-ji-xie-fa-cong-di-gui-dao-oe0di/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = l1;
        recAddTwo(l1, l2);
        return res;
    }

    private void recAddTwo(ListNode l1, ListNode l2) {
        int sum = l1.val + (l2 == null ? 0 : l2.val);
        int div = sum / 10;
        int mod = sum % 10;
        l1.val = mod;

        if(l1 != null) {
            if(l1.next == null && div > 0) {
                l1.next = new ListNode(div);
                l1 = l1.next;
            } else {
                l1.val = l1.val + div;
                l1 = l1.next;
            }
        } else {
            l1 = l2;
            l1.val = l1.val + div;
            l1 = l1.next;
            l2 = null;
        }
        if(l2 != null) {
            l2 = l2.next;
        }
        if(l1 == null && l2 == null) {
            return;
        }


        addTwoNumbers(l1, l2);
    }
}