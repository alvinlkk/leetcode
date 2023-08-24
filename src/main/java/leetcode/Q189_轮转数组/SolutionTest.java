package leetcode.Q189_轮转数组;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/22  18:59
 */
public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[] nums = {1,2,3,4,5,6,7};
        solution.rotate(nums, 3);
        System.out.println(nums);
    }
}
