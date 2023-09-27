package leetcode.LC2582;

/**
 * <p>描 述：</p>
 * n 个人站成一排，按从 1 到 n 编号。
 * <p>
 * 最初，排在队首的第一个人拿着一个枕头。每秒钟，拿着枕头的人会将枕头传递给队伍中的下一个人。一旦枕头到达队首或队尾，传递方向就会改变，队伍会继续沿相反方向传递枕头。
 * <p>
 * 例如，当枕头到达第 n 个人时，TA 会将枕头传递给第 n - 1 个人，然后传递给第 n - 2 个人，依此类推。
 * 给你两个正整数 n 和 time ，返回 time 秒后拿着枕头的人的编号。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/27  10:12
 */
public class Solution {

    public int passThePillow(int n, int time) {
        int mod = time % (n-1);
        int div = time / (n-1);
        // 表示往回走
        if(div % 2 == 1) {
            return n - mod;
        } else {
            return mod + 1;
        }
    }
}
