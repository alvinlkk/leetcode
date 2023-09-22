package leetcode.LC2591;

/**
 * <p>描 述：</p>
 * 给你一个整数 money ，表示你总共有的钱数（单位为美元）和另一个整数 children ，表示你要将钱分配给多少个儿童。
 * <p>
 * 你需要按照如下规则分配：
 * <p>
 * 所有的钱都必须被分配。
 * 每个儿童至少获得 1 美元。
 * 没有人获得 4 美元。
 * 请你按照上述规则分配金钱，并返回 最多 有多少个儿童获得 恰好 8 美元。如果没有任何分配方案，返回 -1 。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/22  15:50
 */
public class Solution {

    /**
     * 如果n个孩子获得8美元
     * money - (8 * n) > children - n
     *
     * @param money
     * @param children
     * @return
     */
    public int distMoney(int money, int children) {
        // 如果钱不够分，返回-1
        if(money < children) {
            return -1;
        }

        if(money > 8 * children) {
            return children - 1;
        }

        if(money == 8 * children + 4) {
            return children - 2;
        }

        // money - (x * 8) >= children - x
        return (money - children) / 7;
    }
}
