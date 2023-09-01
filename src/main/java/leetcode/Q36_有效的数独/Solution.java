package leetcode.Q36_有效的数独;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>描 述：</p>
 * 请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/31  20:12
 */
public class Solution {
    /**
     * 1. 同一行  a[1][j]  a[2][j]
     * 2. 同一列  a[i][1]  a[i][2]
     * 3. 3x3宫格  a[0][0] a[0][1] a[0][2]
     * a[1][0] a[1][1] a[1][2]
     * a[2][0] a[2][1] a[2][2]
     *
     * @param board
     * @return
     */
    public boolean isValidSudoku1(char[][] board) {
        Set<Character> hSet = new HashSet<>(9);
        Set<Character> vSet = new HashSet<>(9);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char hChar = board[i][j];
                if (hChar != '.') {
                    if (hSet.contains(hChar)) {
                        return false;
                    }
                    hSet.add(hChar);
                }

                char vChar = board[j][i];
                if (vChar != '.') {
                    if (vSet.contains(vChar)) {
                        return false;
                    }
                    vSet.add(vChar);
                }

            }
            hSet.clear();
            vSet.clear();
        }

        // 3x3
        Set<Character> set = new HashSet<>(9);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int a = 0; a < 3; a++) {
                        char ch = board[3 * i + k][3 * j + a];
                        if (ch != '.') {
                            if (set.contains(ch)) {
                                return false;
                            }
                            set.add(ch);
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        int[][] columns = new int[9][9];
        int[][] rows = new int[9][9];
        int[][][] box = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    int index = ch - '1';
                    columns[i][index]++;
                    rows[j][index]++;
                    box[i / 3][j / 3][index]++;
                    if (columns[i][index] > 1 || rows[j][index] > 1 || box[i / 3][j / 3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
