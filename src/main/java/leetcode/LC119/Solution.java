package leetcode.LC119;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>描 述：</p>
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/22  19:03
 */
public class Solution {


    public List<Integer> getRow(int rowIndex) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> targetRow = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j <= i ; j++) {
                if(j == 0 || i == j) {
                    targetRow.add(1);
                } else {
                    int val = temp.get(j - 1) + temp.get(j);
                    targetRow.add(val);
                }
            }
            temp = new ArrayList<>(targetRow);
            if(i != rowIndex) {
                targetRow.clear();
            }
        }
        return targetRow;
    }
}
