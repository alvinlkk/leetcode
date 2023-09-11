/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q48_旋转图像;

/**
 * 类的描述
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * <p>
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/2
 **/
public class Solution {

    /**
     * 思路：
     * matrix[i][j]经理了4次旋转 01 -> 13 -> 32 -> 20    02 -> 23 -> 31 -> 10
     * 1. matrix[i][j] ->  matrix[j][n-i] -> matrix[j][n-i] -> matrix[]
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int x = i, y = j;
                int temp = matrix[x][y];
                // 旋转4次
                for (int k = 1; k <= 4; k++) {
                    int tempx = x;
                    x = y;
                    y = n - tempx - 1;
                    int value = matrix[x][y];
                    matrix[x][y] = temp;
                    temp = value;
                }
            }
        }
    }
}
