package leetcode.Q2337_移动片段得到字符串;

/**
 * <p>描 述：</p>
 * 给你两个字符串 start 和 target ，长度均为 n 。每个字符串 仅 由字符 'L'、'R' 和 '_' 组成，其中：
 * <p>
 * 字符 'L' 和 'R' 表示片段，其中片段 'L' 只有在其左侧直接存在一个 空位 时才能向 左 移动，而片段 'R' 只有在其右侧直接存在一个 空位 时才能向 右 移动。
 * 字符 '_' 表示可以被 任意 'L' 或 'R' 片段占据的空位。
 * 如果在移动字符串 start 中的片段任意次之后可以得到字符串 target ，返回 true ；否则，返回 false 。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/21  12:35
 */
public class Solution {
    /**
     * 思路：
     * start和target字符都进行挪动，挪动到不能挪为止，然后比较
     *
     * @param start
     * @param target
     * @return
     */
    public boolean canChange(String start, String target) {
        return false;
    }
}
