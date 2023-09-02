/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q2240_买钢笔和铅笔的方案数;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/1
 **/
public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        long cnt = solution.waysToBuyPensPencils(20, 10, 5);
        Assertions.assertEquals(cnt, 9);
    }
}
