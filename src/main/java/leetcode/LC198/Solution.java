package leetcode.LC198;

/**
 * <p>描 述：</p>
 *你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/18  9:48
 */
public class Solution {
    /**
     * [1,2,3,1,5,6,33,2,1,42,1,11,2]
     * 1. 状态： dp[i] 表示抢劫前i号房最大的金额
     * 2. 转移方程：dp[i] = max(dp[i-2] + num, dp[i-1])
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        int size = nums.length;
        int[] dp = new int[size + 1];

        dp[0] = 0;
        dp[1] = nums[0];
        for (int i=1; i<size; i++) {
            dp[i+1] = Math.max(dp[i-1] + nums[i], dp[i]);
        }
        return dp[size];
    }

    public int rob2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 子问题：
        // f(k) = 偷 [0..k) 房间中的最大金额

        // f(0) = 0
        // f(1) = nums[0]
        // f(k) = max{ rob(k-1), nums[k-1] + rob(k-2) }

        int N = nums.length;
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int k = 2; k <= N; k++) {
            dp[k] = Math.max(dp[k-1], nums[k-1] + dp[k-2]);
        }
        return dp[N];
    }

    public int rob3(int[] nums) {
        int prev = 0;
        int curr = 0;

        // 每次循环，计算“偷到当前房子为止的最大金额”
        for (int i : nums) {
            // 循环开始时，curr 表示 dp[k-1]，prev 表示 dp[k-2]
            // dp[k] = max{ dp[k-1], dp[k-2] + i }
            int temp = Math.max(curr, prev + i);
            prev = curr;
            curr = temp;
            // 循环结束时，curr 表示 dp[k]，prev 表示 dp[k-1]
        }

        return curr;
    }
}
