package leetcode.Q1782_统计点对的数目;

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
        int[][] edges = {
                new int[] {1,2}, new int[] {2,4}, new int[] {1,3}, new int[] {2,3},new int[] {2,1}
        };
        int[] queries = {2, 3};
        int[] answers = solution.countPairs(4, edges, queries);
        System.out.println(answers);
    }

    @Test
    public void test2() {
        int[][] edges = {
                new int[] {1,5}, new int[] {1,5}, new int[] {3,4}, new int[] {2,5},new int[] {1,3},
                new int[] {5,1},new int[] {2,3},new int[] {2,5}
        };
        int[] queries = {1, 2, 3,4,5};
        int[] answers = solution.countPairs(5, edges, queries);
        System.out.println(answers);
    }


}
