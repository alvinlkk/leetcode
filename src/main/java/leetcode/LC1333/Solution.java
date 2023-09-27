package leetcode.LC1333;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>描 述：</p>
 * 给你一个餐馆信息数组 restaurants，其中  restaurants[i] = [idi, ratingi, veganFriendlyi, pricei, distancei]。你必须使用以下三个过滤器来过滤这些餐馆信息。
 * <p>
 * 其中素食者友好过滤器 veganFriendly 的值可以为 true 或者 false，如果为 true 就意味着你应该只包括 veganFriendlyi 为 true 的餐馆，为 false 则意味着可以包括任何餐馆。此外，我们还有最大价格 maxPrice 和最大距离 maxDistance 两个过滤器，它们分别考虑餐厅的价格因素和距离因素的最大值。
 * <p>
 * 过滤后返回餐馆的 id，按照 rating 从高到低排序。如果 rating 相同，那么按 id 从高到低排序。简单起见， veganFriendlyi 和 veganFriendly 为 true 时取值为 1，为 false 时，取值为 0 。
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/9/27  9:50
 */
public class Solution {

    /**
     * @param restaurants
     * @param veganFriendly
     * @param maxPrice
     * @param maxDistance
     * @return
     */
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> tempList = new ArrayList<>();
        for (int i = 0; i < restaurants.length; i++) {
            int[] restaurant = restaurants[i];
            if ((veganFriendly == 1 && restaurant[2] == 1 || veganFriendly == 0)
                    && restaurant[3] <= maxPrice
                    && restaurant[4] <= maxDistance) {
                tempList.add(new int[] {restaurant[0], restaurant[1]});
            }
        }
        // sort temp list
        Collections.sort(tempList, (o1, o2) -> {
            int sub = o2[1] - o1[1];
            if(sub == 0) {
                return o2[0] - o1[0];
            } else {
                return sub;
            }
        });

        return tempList.stream().map(item -> item[0]).collect(Collectors.toList());
    }
}
