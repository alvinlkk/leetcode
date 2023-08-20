/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q1646_获取生成数组中的最大值;

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
        int maximumGenerated = solution.getMaximumGenerated(7);
        Assertions.assertEquals(maximumGenerated, 3);
    }
}
