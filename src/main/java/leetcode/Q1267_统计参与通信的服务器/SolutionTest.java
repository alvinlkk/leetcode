package leetcode.Q1267_统计参与通信的服务器;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/24  10:17
 */
public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[] a = {1,0};
        int[] b = {1,1};
        int[][] grid = {a, b};

        solution.countServers(grid);
    }
}
