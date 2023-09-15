package leetcode.LC9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/15  20:54
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        boolean palindrome = solution.isPalindrome(121);
        Assertions.assertTrue(palindrome);
    }

}
