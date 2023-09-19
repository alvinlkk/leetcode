package leetcode.LC122;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/24  19:26
 */
public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[] nums = {7,6,5};
        int res = solution.maxProfit(nums);
        Assertions.assertEquals(res, 0);
    }
}
