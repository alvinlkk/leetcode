package leetcode.Q2682_找出转圈游戏输家;

import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/17  17:24
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] resArr = solution.circularGameLosers(5, 2);
        System.out.println(resArr);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] resArr = solution.circularGameLosers(4, 4);
        System.out.println(resArr);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] resArr = solution.circularGameLosers(2, 1);
        System.out.println(resArr);
    }
}
