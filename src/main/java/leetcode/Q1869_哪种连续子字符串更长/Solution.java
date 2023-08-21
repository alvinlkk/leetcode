package leetcode.Q1869_哪种连续子字符串更长;

/**
 * <p>描 述：</p>
 * 给你一个二进制字符串 s 。如果字符串中由 1 组成的 最长 连续子字符串 严格长于 由 0 组成的 最长 连续子字符串，返回 true ；否则，返回 false 。
 * <p>
 * 例如，s = "110100010" 中，由 1 组成的最长连续子字符串的长度是 2 ，由 0 组成的最长连续子字符串的长度是 3 。
 * 注意，如果字符串中不存在 0 ，此时认为由 0 组成的最长连续子字符串的长度是 0 。字符串中不存在 1 的情况也适用此规则。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/21  20:22
 */
public class Solution {

    /**
     * 动态规划版本
     *
     * @param s
     * @return
     */
    public boolean checkZeroOnes(String s) {
        int len = s.length();
        int[] dp0 = new int[len + 1];
        int[] dp1 = new int[len + 1];
        dp0[0] = 0;
        dp0[1] = 0;
        int max0 = 0;
        int max1 = 0;
        for (int i = 1; i <= len; i++) {
            char ch = s.charAt(i - 1);
            if (ch == '0') {
                dp0[i] = dp0[i - 1] + 1;
            } else if (ch == '1') {
                dp1[i] = dp1[i - 1] + 1;
            }
            max0 = Math.max(max0, dp0[i]);
            max1 = Math.max(max1, dp1[i]);
        }

        return max1 > max0;
    }

    public boolean checkZeroOnes1(String s) {
        int pre0 = 0, max0 = 0;
        int pre1 = 0, max1 = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '0') {
                pre0++;
                max0 = Math.max(pre0, max0);
                pre1 = 0;
            } else if (ch == '1') {
                pre1++;
                max1 = Math.max(pre1, max1);
                pre0 = 0;
            }
        }

        return max1 > max0;
    }
}
