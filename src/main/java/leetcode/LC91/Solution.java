/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC91;

/**
 * 类的描述
 * 一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
 * <p>
 * 'A' -> "1"
 * 'B' -> "2"
 * ...
 * 'Z' -> "26"
 * 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。例如，"11106" 可以映射为：
 * <p>
 * "AAJF" ，将消息分组为 (1 1 10 6)
 * "KJF" ，将消息分组为 (11 10 6)
 * 注意，消息不能分组为  (1 11 06) ，因为 "06" 不能映射为 "F" ，这是由于 "6" 和 "06" 在映射中并不等价。
 * <p>
 * 给你一个只含数字的 非空 字符串 s ，请计算并返回 解码 方法的 总数 。
 * <p>
 * 题目数据保证答案肯定是一个 32 位 的整数。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/18
 **/
public class Solution {

    /**
     * 动态规划
     * 1. 状态定义
     * dp[i]: 表示第i个字符最大的数量
     * 2. 状态转移方程   111235
     * a. dp[i] = dp[i-2] + dp[i-1]
     *
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        int size = s.length();
        if (size == 0) {
            return 0;
        }
        int[] dp = new int[size + 1];
        dp[0] = 1;
        char ch = s.charAt(0);
        if (ch == '0') {
            return 0;
        }
        dp[1] = 1;
        for (int i = 1; i < size; i++) {
            char nowChar = s.charAt(i);
            char beforeChar = s.charAt(i - 1);

            int m = 0;
            if (nowChar != '0') {
                m = dp[i];
            }
            int n = 0;
            if (beforeChar == '1' || (beforeChar == '2' && nowChar <= '6')) {
                n = dp[i - 1];
            }
            dp[i + 1] = m + n;
            if (dp[i + 1] == 0) {
                return 0;
            }
        }
        return dp[size];
    }
}
