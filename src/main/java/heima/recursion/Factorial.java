package heima.recursion;

/**
 * <p>描 述：</p>
 * 阶乘
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/19  20:23
 */
public class Factorial {

    public int f(int n) {
        if(n==1) {
            return 1;
        }
        return n * f(n-1);
    }
}
