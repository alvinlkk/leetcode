/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q344_反转字符串;

/**
 * 类的描述
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/2
 **/
public class Solution {
    /**
     * @param s
     */
    public void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[n - i - 1];
            s[n - i - 1] = s[i];
            s[i] = temp;
        }
    }
}
