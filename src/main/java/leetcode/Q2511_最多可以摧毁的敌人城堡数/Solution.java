/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q2511_最多可以摧毁的敌人城堡数;

/**
 * 类的描述
 * 给你一个长度为 n ，下标从 0 开始的整数数组 forts ，表示一些城堡。forts[i] 可以是 -1 ，0 或者 1 ，其中：
 * <p>
 * -1 表示第 i 个位置 没有 城堡。
 * 0 表示第 i 个位置有一个 敌人 的城堡。
 * 1 表示第 i 个位置有一个你控制的城堡。
 * 现在，你需要决定，将你的军队从某个你控制的城堡位置 i 移动到一个空的位置 j ，满足：
 * <p>
 * 0 <= i, j <= n - 1
 * 军队经过的位置 只有 敌人的城堡。正式的，对于所有 min(i,j) < k < max(i,j) 的 k ，都满足 forts[k] == 0 。
 * 当军队移动时，所有途中经过的敌人城堡都会被 摧毁 。
 * <p>
 * 请你返回 最多 可以摧毁的敌人城堡数目。如果 无法 移动你的军队，或者没有你控制的城堡，请返回 0 。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/2
 **/
public class Solution {

    /**
     * 思路：
     * - max: 最大数量
     * - 双指针
     * <p>
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * by alvin
     *
     * @param forts
     * @return
     */
    public int captureForts1(int[] forts) {
        int max = 0;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1 || forts[i] == -1) {
                int j = i + 1;
                while (j < forts.length) {
                    // 如果相同，就跳过
                    if (forts[i] == forts[j]) {
                        i = j - 1;
                        break;
                        // 符合条件，取最大值
                    } else if (forts[i] == -forts[j]) {
                        max = Math.max(max, j - i - 1);
                        i = j - 1;
                        break;
                    }
                    j++;
                }
            }
        }
        return max;
    }

    public int captureForts(int[] forts) {
        int max = 0;
        int pre = -1;
        for (int i = 0; i < forts.length; i++) {
            if(forts[i]  == -1 || forts[i] == 1) {
                if(pre >=0 && forts[i] != forts[pre]) {
                    max = Math.max(max, i  - pre - 1);
                }
                pre = i;
            }
        }
        return max;
    }
}
