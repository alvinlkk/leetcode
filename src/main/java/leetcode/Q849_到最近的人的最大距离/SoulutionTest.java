package leetcode.Q849_到最近的人的最大距离;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/22  13:38
 */
public class SoulutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] seats = {1,0,0,0,1,0,1};
        int res = solution.maxDistToClosest(seats);
        Assertions.assertEquals(res, 2);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] seats = {1,0,0,0};
        int res = solution.maxDistToClosest(seats);
        Assertions.assertEquals(res, 3);
    }
}
