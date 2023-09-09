package leetcode.Q2605_从两个数字数组里生成最小数字;

import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/5  10:15
 */
public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums1 = {3,5,2,6};
        int[] nums2 = {3,1,7};

        solution.minNumber(nums1, nums2);
    }
}
