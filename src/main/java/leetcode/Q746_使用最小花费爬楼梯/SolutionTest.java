package leetcode.Q746_使用最小花费爬楼梯;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/17  19:49
 */
public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] cost = {10, 15, 20};
        int res = solution.minCostClimbingStairs(cost);
        Assertions.assertEquals(res, 15);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int res = solution.minCostClimbingStairs(cost);
        Assertions.assertEquals(res, 6);
    }
}
