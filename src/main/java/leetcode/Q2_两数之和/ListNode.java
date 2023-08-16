package leetcode.Q2_两数之和;

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

/**
 * 思路： 递归
 */
class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recAddTwo(l1, l2, 0);
    }

    private ListNode recAddTwo(ListNode l1, ListNode l2, int carry) {
        // 退出递归的条件
        if(l1 == null && l2 == null) {
            return carry > 0 ? new ListNode(carry) : null;
        }

        // 如果l1为空，那么l2不为空，让l1=l2, l1作为返回的链表
        if(l1 == null) {
            l1 = l2;
            l2 = null;
        }

        int sum = l1.val + carry + (l2 == null ? 0 : l2.val);
        int mod = sum % 10;
        l1.val = mod;
        int div = sum / 10;
        l1.next = recAddTwo(l1.next, (l2 != null ? l2.next : null), div);
        return l1;
    }
}