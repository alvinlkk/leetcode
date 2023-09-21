package leetcode.O0806;

import java.util.List;

/**
 * <p>描 述：</p>
 * 在经典汉诺塔问题中，有 3 根柱子及 N 个不同大小的穿孔圆盘，盘子可以滑入任意一根柱子。一开始，所有盘子自上而下按升序依次套在第一根柱子上(即每一个盘子只能放在更大的盘子上面)。移动圆盘时受到以下限制:
 * (1) 每次只能移动一个盘子;
 * (2) 盘子只能从柱子顶端滑出移到下一根柱子;
 * (3) 盘子只能叠在比它大的盘子上。
 * <p>
 * 请编写程序，用栈将所有盘子从第一根柱子移到最后一根柱子。
 * <p>
 * 你需要原地修改栈。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/21  20:40
 */
public class Solution {

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(), A, B, C);
    }

    /**
     * 移动
     *
     * @param n 数量
     * @param A 源柱子
     * @param B 中间柱子
     * @param C 目标柱子
     */
    private void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 0) {
            return;
        }

        // n-1个从A移动到B
        move(n - 1, A, C, B);
        // 第n个从A移动到C
        C.add(A.remove(A.size() - 1));
        move(n - 1, B, A, C);
    }
}
