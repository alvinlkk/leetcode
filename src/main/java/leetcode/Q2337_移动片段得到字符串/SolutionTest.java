package leetcode.Q2337_移动片段得到字符串;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/21  13:32
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        boolean bool = solution.canChange("_L__R__R_", "L______RR");
        Assertions.assertTrue(bool);
    }


    @Test
    public void test2() {
        Solution solution = new Solution();
        boolean bool = solution.canChange("R_L_", "__LR");
        Assertions.assertFalse(bool);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        boolean bool = solution.canChange("_R", "R_");
        Assertions.assertFalse(bool);
    }
}
