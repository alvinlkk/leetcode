/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC48;

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
        int [][] matrix = {
                new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9}
        };
        solution.rotate(matrix);
    }
}
