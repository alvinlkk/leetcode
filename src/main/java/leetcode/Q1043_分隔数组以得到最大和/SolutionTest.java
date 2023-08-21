/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q1043_分隔数组以得到最大和;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/20
 **/
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] arr = {1,15,7,9,2,5,10};
        int max = solution.maxSumAfterPartitioning(arr, 3);
        Assertions.assertEquals(max, 84);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] arr = {1,4,1,5,7,3,6,1,9,9,3};
        int max = solution.maxSumAfterPartitioning(arr, 4);
        Assertions.assertEquals(max, 83);
    }
}
