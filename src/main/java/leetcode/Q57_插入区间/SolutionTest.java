/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q57_插入区间;

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
        int[][] intervals = new int[][]{new int[]{1, 3}, new int[]{6, 9}};
        int[] newIntervals = {2, 5};
        int[][] merge = solution.insert(intervals, newIntervals);
        System.out.println(merge.length);

    }
}
