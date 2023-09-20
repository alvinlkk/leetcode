package heima.recursion_single;

/**
 * <p>描 述：</p>
 * 递归二分查找
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/19  20:40
 */
public class E03BinarySearch {


    public static int search(int[] a, int target) {
        return f(a, target, 0, a.length - 1);
    }


    private static int f(int[] a, int target, int i, int j) {
        if (i > j) {
            return -1;
        }
        int m = (i + j) >>> 1;
        if (target > a[m]) {
            return f(a, target, m + 1, j);
        } else if (a[m] > target) {
            return f(a, target, i, m - 1);
        } else {
            return m;
        }
    }

}
