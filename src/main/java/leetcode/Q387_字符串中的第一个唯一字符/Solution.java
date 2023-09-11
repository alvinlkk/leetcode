/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package leetcode.Q387_字符串中的第一个唯一字符;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

/**
 * 类的描述
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 *
 * @author alvin
 * @version 7.x
 * @since 2023/9/2
 **/
public class Solution {
    /**
     * 1. 循环遍历
     *
     * 2. hash方法
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>(chars.length);
        for (int i = 0; i < chars.length; i++) {
            map.merge(chars[i], 1, Integer::sum);
        }

        for (int i = 0; i < chars.length; i++) {
            Integer count = map.get(chars[i]);
            if(count == 1) {
                return i;
            }
        }
        return -1;
    }
}
