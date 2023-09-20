package heima.recursion_single;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/20  21:13
 */
public class E05InsertionSort {


    private static void insertion(int[] a, int low) {
        if(low == a.length) {
            return;
        }

        int t = a[low];
        int i = low - 1;
        while (i > 0 && a[low] < a[i]) {
            a[i + 1] = a[i];
            i--;
        }
        if (i + 1 != low) {
            a[i + 1] = t;
        }

        insertion(a, low + 1);
    }
}
