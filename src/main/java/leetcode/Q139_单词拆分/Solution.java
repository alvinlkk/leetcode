package leetcode.Q139_单词拆分;

import java.util.List;

/**
 * <p>描 述：</p>
 * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
 *
 * 注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/21  11:56
 */
public class Solution {

    /**
     * 动态规划，拆解子任务问题
     *
     * 1. 状态 dp[i] 表示是否拼接成功
     * 2. 转移方程
     *  循环遍历wordDict, dp[i] = dp[i-n]&& 字符串匹配
     * 3. 初始条件
     * dp[0] = true
     *
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;

        for(int i=1; i<=length; i++) {
            for (String word : wordDict) {
                int wordLenth = word.length();
                if(i >= wordLenth) {
                    int lastPos = i - wordLenth;
                    String subString = s.substring(i - wordLenth, i);
                    dp[i] = dp[lastPos] && word.equals(subString);
                }
                if(dp[i]) {
                    break;
                }
            }
        }

        return dp[length];
    }
}
