package leetcode.Q139_单词拆分;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/8/21  12:23
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();

        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        boolean bool = solution.wordBreak(s, wordDict);
        Assertions.assertTrue(bool);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();

        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        boolean bool = solution.wordBreak(s, wordDict);
        Assertions.assertTrue(bool);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();

        String s = "catsandog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        boolean bool = solution.wordBreak(s, wordDict);
        Assertions.assertFalse(bool);
    }
}
