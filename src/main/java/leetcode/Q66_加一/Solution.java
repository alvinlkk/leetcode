/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q66_加一;

/**
 * 类的描述
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/28
 **/
public class Solution {

    /**
     * - 最后位加1， 如果满足10，要进位
     * - 数组从后往前遍历
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        // 进位数
        int step = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + step;
            digits[i] = num % 10;
            step = num / 10;
            if (step == 0) {
                break;
            }
        }
        if (step == 1) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                ans[i + 1] = digits[i];
            }
            return ans;
        }
        return digits;
    }
}
