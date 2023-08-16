package offer.Q10_青蛙跳台阶问题;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/16  9:55
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int num = solution.numWays(2);
        Assertions.assertEquals(num, 2);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int num = solution.numWays(7);
        Assertions.assertEquals(num, 21);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int num = solution.numWays(0);
        Assertions.assertEquals(num, 1);
    }

    @Test
    public void test44() {
        Solution solution = new Solution();
        int num = solution.numWays(44);
        Assertions.assertEquals(num, 134903163);
    }
}
