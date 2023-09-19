/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC136;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/28
 **/
public class SolutionTest {

    private Solution solution;

    @BeforeEach
    private void init() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[] nums = {2,2,1};
        int res = solution.singleNumber(nums);
        System.out.println(res);
    }

    @Test
    public void test2() {
        int[] nums = {4,1,2,1,2};
        int res = solution.singleNumber(nums);
        System.out.println(res);
    }
}
