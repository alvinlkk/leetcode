/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/29
 **/
public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[] arr = {3,2,4};
        int[] ints = solution.twoSum(arr, 6);
        System.out.println(ints);
    }
}
