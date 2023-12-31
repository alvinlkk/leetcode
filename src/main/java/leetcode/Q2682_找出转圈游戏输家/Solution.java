package leetcode.Q2682_找出转圈游戏输家;

/**
 * <p>描 述：</p>
 * n 个朋友在玩游戏。这些朋友坐成一个圈，按 顺时针方向 从 1 到 n 编号。从第 i 个朋友的位置开始顺时针移动 1 步会到达第 (i + 1) 个朋友的位置（1 <= i < n），
 * 而从第 n 个朋友的位置开始顺时针移动 1 步会回到第 1 个朋友的位置。
 * 游戏规则如下：
 * 第 1 个朋友接球。
 * 接着，第 1 个朋友将球传给距离他顺时针方向 k 步的朋友。
 * 然后，接球的朋友应该把球传给距离他顺时针方向 2 * k 步的朋友。
 * 接着，接球的朋友应该把球传给距离他顺时针方向 3 * k 步的朋友，以此类推。
 * 换句话说，在第 i 轮中持有球的那位朋友需要将球传递给距离他顺时针方向 i * k 步的朋友。
 * 当某个朋友第 2 次接到球时，游戏结束。
 *
 * 在整场游戏中没有接到过球的朋友是 输家 。
 *
 * 给你参与游戏的朋友数量 n 和一个整数 k ，请按升序排列返回包含所有输家编号的数组 answer 作为答案。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/16  13:13
 */
public class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] arr = new boolean[n];

        int turns = 1;
        int ballPos = 0;
        while (true) {
            arr[ballPos] = true;
            ballPos = (ballPos + turns * k) % n;
            if(arr[ballPos]) {
                break;
            }
            turns ++;
        }

        int failCount = 0;
        for(int i=0; i<n; i++) {
            if(!arr[i]) {
                failCount ++;
            }
        }
        int[] resArr = new int[failCount];
        int index = 0;
        for(int i=0; i<n; i++) {
            if(!arr[i]) {
                resArr[index] = i + 1;
                index ++;
            }
        }

        return resArr;
    }
}
