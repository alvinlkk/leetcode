/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q228_汇总区间;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/26
 **/
public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[] nums = {0,2,3,4,6,8,9};
        List<String> res = solution.summaryRanges(nums);
        System.out.println(res);

    }

    @Test
    public void test2() {
        int[] nums = {0,1,2,4,5,7};
        List<String> res = solution.summaryRanges(nums);
        System.out.println(res);

    }

    @Test
    public void test3() {
        int[] nums = {0};
        List<String> res = solution.summaryRanges(nums);
        System.out.println(res);

    }


}
