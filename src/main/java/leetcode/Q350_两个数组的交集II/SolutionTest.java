/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q350_两个数组的交集II;

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
    public void init() {
        solution = new Solution();
    }


    @Test
    public void test1() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        solution.intersect(nums1, nums2);
    }
}
