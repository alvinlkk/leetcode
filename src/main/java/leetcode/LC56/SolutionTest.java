/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.LC56;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/27
 **/
public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[][] intervals = new int[][]{new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}, new int[]{15, 18}};
        int[][] merge = solution.merge(intervals);
        System.out.println(merge.length);

    }
}
