package leetcode.LC213;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/19  10:52
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 3, 2};
        int rob = solution.rob(nums);
        Assertions.assertEquals(rob, 3);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        int rob = solution.rob(nums);
        Assertions.assertEquals(rob, 4);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int rob = solution.rob(nums);
        Assertions.assertEquals(rob, 3);
    }
}
