package leetcode.LCP50;

import java.util.Arrays;

/**
 * <p>描 述：</p>
 * 欢迎各位勇者来到力扣新手村，在开始试炼之前，请各位勇者先进行「宝石补给」。
 * <p>
 * 每位勇者初始都拥有一些能量宝石， gem[i] 表示第 i 位勇者的宝石数量。现在这些勇者们进行了一系列的赠送，operations[j] = [x, y] 表示在第 j 次的赠送中 第 x 位勇者将自己一半的宝石（需向下取整）赠送给第 y 位勇者。
 * <p>
 * 在完成所有的赠送后，请找到拥有最多宝石的勇者和拥有最少宝石的勇者，并返回他们二者的宝石数量之差。
 * <p>
 * 注意：
 * <p>
 * 赠送将按顺序逐步进行。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/15  19:43
 */
public class Solution {

    /**
     * @param gem
     * @param operations
     * @return
     */
    public int giveGem(int[] gem, int[][] operations) {
        for (int i = 0; i < operations.length; i++) {
            int from = operations[i][0];
            int to = operations[i][1];
            int cnt = gem[from];
            if (cnt == 0) {
                continue;
            }
            int sendCnt = cnt >>> 1;
            gem[from] = gem[from] - sendCnt;
            gem[to] = gem[to] + sendCnt;
        }
        int mn = gem[0], mx = gem[0];
        for (int number : gem) {
            mn = Math.min(number, mn);
            mx = Math.max(number, mx);
        }
        return mx - mn;
    }
}
