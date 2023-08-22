package leetcode.Q2236_判断根结点是否等于子结点之和.Q1869_哪种连续子字符串更长;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/21  20:42
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        boolean bool = solution.checkZeroOnes("1101");
        Assertions.assertTrue(bool);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        boolean bool = solution.checkZeroOnes("111000");
        Assertions.assertFalse(bool);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        boolean bool = solution.checkZeroOnes("110100010");
        Assertions.assertFalse(bool);
    }
}
