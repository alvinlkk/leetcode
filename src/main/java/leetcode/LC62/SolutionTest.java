package leetcode.LC62;

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
        int ways = solution.uniquePaths(3, 7);
        Assertions.assertEquals(ways, 28);
    }

    @Test
    public void test2() {
        int ways = solution.uniquePaths(3, 2);
        Assertions.assertEquals(ways, 3);
    }

    @Test
    public void test3() {
        int ways = solution.uniquePaths(7, 3);
        Assertions.assertEquals(ways, 28);
    }

    @Test
    public void test4() {
        int ways = solution.uniquePaths(3, 3);
        Assertions.assertEquals(ways, 6);
    }
}
