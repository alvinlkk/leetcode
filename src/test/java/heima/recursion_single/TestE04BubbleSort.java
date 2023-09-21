package heima.recursion_single;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestE04BubbleSort {

    @Test
    @DisplayName("测试递归冒泡")
    public void test1() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] a1 = {5, 4, 3, 2, 1};
        E04BubbleSort.sort(a1);
        assertArrayEquals(expected, a1);

        int[] a2 = {4, 5, 3, 2, 1};
        E04BubbleSort.sort(a2);
        assertArrayEquals(expected, a2);

        int[] a4 = {3, 1, 4, 2, 5};
        E04BubbleSort.sort(a4);
        assertArrayEquals(expected, a4);

        int[] a3 = {1, 2, 3, 4, 5};
        E04BubbleSort.sort(a3);
        assertArrayEquals(expected, a3);
    }
}
