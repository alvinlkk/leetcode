/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q823_带因子的二叉树;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 类的描述
 * 给出一个含有不重复整数元素的数组 arr ，每个整数 arr[i] 均大于 1。
 * <p>
 * 用这些整数来构建二叉树，每个整数可以使用任意次数。
 * 其中：每个非叶结点的值应等于它的两个子结点的值的乘积。
 * <p>
 * 满足条件的二叉树一共有多少个？答案可能很大，返回 对 109 + 7 取余 的结果。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/8/29
 **/
public class Solution {
    /**
     * 递归的方式 + 记忆化搜索
     *
     * @param arr
     * @return
     */
    public int numFactoredBinaryTrees(int[] arr) {
        long MOD = (long) 1e9 + 7;
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        // 存储每个位置下的数量
        long[] memo = new long[arr.length];
        Arrays.fill(memo, -1);
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += dfs(i, arr, memo, map);
        }
        return (int) (ans % MOD);
    }

    private long dfs(int i, int[] arr, long[] memo, Map<Integer, Integer> map) {
        if(memo[i] != -1) {
            return memo[i];
        }
        long res = 1;
        int val = arr[i];
        for (int j = 0; j < i; j++) {
            int x = arr[j];
            if (val % x == 0 && map.containsKey(val / x)) {
                res += dfs(j, arr, memo, map) * dfs(map.get(val / x), arr, memo, map);
            }
        }
        memo[i] = res;
        return res;
    }
}
