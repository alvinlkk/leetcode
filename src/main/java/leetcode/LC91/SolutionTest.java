/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC91;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/19
 **/
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int nums = solution.numDecodings("12");
        Assertions.assertEquals(nums, 2);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int nums = solution.numDecodings("226");
        Assertions.assertEquals(nums, 3);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int nums = solution.numDecodings("06");
        Assertions.assertEquals(nums, 0);
    }
}
