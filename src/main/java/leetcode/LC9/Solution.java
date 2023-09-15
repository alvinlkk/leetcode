package leetcode.LC9;

/**
 * <p>描 述：</p>
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 例如，121 是回文，而 123 不是。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/15  20:37
 */
public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if(x == 0) {
            return true;
        }
        int mod = x % 10;
        if (mod == 0) {
            return false;
        }
        int reverseNum = mod;
        int div = x / 10;
        while (div != 0) {
            mod = div % 10;
            div = div / 10;
            reverseNum = reverseNum * 10 + mod;
        }
        return x == reverseNum;
    }
}
