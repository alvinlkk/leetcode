package Q10_正则表达式匹配;

/**
 * <p>描 述：</p>
 * 思路： 动态规划
 * 1. 确定状态
 * dp[i][j]: 表示s中到i个位置的字符串是否正则匹配到p中第j个字符串，true表示匹配成功，false表示匹配事变
 *
 * 2.动态转移方程
 * 1). when s[i-1] == p[j-1]时
 *   表示最后一个字符串匹配，那么子问题就是求前一个是否匹配，则 dp[i][j] = dp[i-1][j-1]
 * 2). when s[i-1] != p[j-1]时
 *    a).if p[j-1] == .
 *        .表示匹配任何字符，所以时匹配的，所以 dp[i][j] = dp[i-1][j-1]
 *    b).if p[j-1] == *
 *       情况相对复杂，* 可以对前一个字符匹配0， 1次 或者 多次，只要其中一种满足即可，分开来讨论
 *       - 若匹配0次
 *         发生匹配0次的条件：s[i-1] != p[j-2] && p[j-1] != '.', 则转移方程是
 *         dp[i][j] = dp[i-1][j-2]
 *       - 匹配1次
 *       - 匹配>=2次
 *
 * 3.初始条件和边界条件
 *
 * 4.计算顺序
 * 从左到右
 * 从上到下
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/7/27  15:33
 */
public class Solution {

    public boolean isMatch(String s, String p) {
        return false;

    }
}
