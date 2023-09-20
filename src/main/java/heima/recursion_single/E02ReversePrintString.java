package heima.recursion_single;

/**
 * <p>描 述：</p>
 * 反正打印字符串
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/19  20:33
 */
public class E02ReversePrintString {

    public static void f(int n, String str) {
        if(n == str.length()) {
            return;
        }
        f(n + 1, str);
        System.out.println(str.charAt(n));
    }

    public static void main(String[] args) {
        f(0, "abcd");
    }
}
