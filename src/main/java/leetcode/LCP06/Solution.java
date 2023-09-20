package leetcode.LCP06;

/**
 * <p>描 述：</p>
 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/20  9:47
 */
public class Solution {

    /**
     * - 每次除以2
     * - 取模还有多余的再拿1次
     *
     * @param coins
     * @return
     */
    public int minCount(int[] coins) {
        int total = 0;
        for (int coin : coins) {
            total += coin / 2 + coin % 2;
        }
        return total;
    }
}
