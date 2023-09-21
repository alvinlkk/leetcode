package heima.recursion_single;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/21  9:46
 */
/**
 * 递归求和 n + n-1, ... + 1
 */
public class E06Sum {

    // f(n) = f(n-1) + n

    public static long sum(long n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(15000));
    }

    /*
    long sum(long n = 15000) {
        return 15000 + long sum(long n = 14999) {
            return 14999 + sum(14998) {
                ...
                return 2 + long sum(long n = 1) {
                    if (n == 1) {
                        return 1;
                    }
                }
            }
        };
    }
     */

}