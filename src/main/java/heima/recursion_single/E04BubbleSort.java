package heima.recursion_single;

/**
 * 递归冒泡排序
 * <ul>
 *     <li>将数组划分成两部分 [0 .. j] [j+1 .. a.length-1]</li>
 *     <li>左边 [0 .. j] 是未排序部分</li>
 *     <li>右边 [j+1 .. a.length-1] 是已排序部分</li>
 *     <li>未排序区间内, 相邻的两个元素比较, 如果前一个大于后一个, 则交换位置</li>
 * </ul>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/20  20:56
 */
public class E04BubbleSort {

    public static void sort(int[] a) {

    }


    private static void bubble(int[] a, int j) {
        if (j == 0) {
            return;
        }

        int x = 0;
        for (int i = 0; i < j; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
                x = i;
            }
        }
        bubble(a, x);
    }
}
