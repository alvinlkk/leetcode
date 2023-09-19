/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC7;

/**
 * 类的描述
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/2
 **/
public class Solution {

    /**
     * ans = ans * 10 + x mod 10
     * 如何判断超出整数范围
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int mod = x % 10;
            //判断是否 大于 最大32位整数
            if(ans>214748364 || (ans==214748364 && mod>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if(ans<-214748364 || (ans==-214748364 && mod<-8)) {
                return 0;
            }
            x = x / 10;
            ans = ans * 10 + mod;
        }
        return ans;
    }
}
