/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q7_整数反转;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/2
 **/
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        int reverse = solution.reverse(-123);
        Assertions.assertEquals(reverse, 321);
    }
    @Test
    public void test2() {
        int reverse = solution.reverse(1999999999);
        Assertions.assertEquals(reverse, 321);
    }

}
