package heima;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/5  13:13
 */
public class BinarySearch {

    /**
     * 二分查找基础版
     *
     * @param a-待查找的升序数组
     * @param target-待查找的目标值
     * @return 找到则返回索引
     * 找不到返回-1
     */
    public static int binarySearchBasic(int[] a, int target) {
        // 设置指针和初值
        int i = 0, j = a.length - 1;
        while (i <= j) {
            // 无符号右移1位， 因为 如果两个很大的数相加，会变成负数，所以要用>>>
            int m = (i + j) >>> 1;
            if (a[m] < target) {
                i = m + 1;
            } else if (target < a[m]) {
                j = m - 1;
            } else {
               return m;
            }
        }
        return -1;
    }

    public static int binarySearchAlternative(int[] a, int target) {
        // 设置指针和初值， 要清楚每个变量背后的含义， i参与预算， j不参与
        int i = 0, j = a.length;
        while (i < j) {
            // 无符号右移1位， 因为 如果两个很大的数相加，会变成负数，所以要用>>>
            int m = (i + j) >>> 1;
            if (a[m] < target) {
                i = m + 1;
            } else if (target < a[m]) {
                j = m;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static int binarySearchLeftmost1(int[] a, int target) {
        int i = 0, j = a.length - 1;
        int candidate = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                candidate = m; // 记录候选位置
                j = m - 1;     // 继续向左
            }
        }
        return candidate;
    }
}
