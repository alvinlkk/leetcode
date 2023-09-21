package heima.recursion_single;

/**
 * 递归插入排序
 * <ul>
 *     <li>将数组分为两部分 [0 .. low-1]  [low .. a.length-1]</li>
 *     <li>左边 [0 .. low-1] 是已排序部分</li>
 *     <li>右边 [low .. a.length-1] 是未排序部分</li>
 *     <li>每次从未排序区域取出 low 位置的元素, 插入到已排序区域</li>
 * </ul>
 */
public class E05InsertionSort {

    public static void sort(int[] a) {
        insertion(a, 1);
    }

    /**
     * <h3>递归函数 将 low 位置的元素插入至 [0..low-1] 的已排序区域</h3>
     *
     * @param a   数组
     * @param low 未排序区域的左边界
     */
    private static void insertion(int[] a, int low) {
        if(low == a.length) {
            return;
        }

        int val = a[low];
        int i = low - 1;
        while (i >= 0 && a[i] > val) {
            a[i + 1] = a[i];
            i --;
        }

        if(i + 1 != low) {
            a[i + 1] = val;
        }
        insertion(a, low + 1);
    }
}
