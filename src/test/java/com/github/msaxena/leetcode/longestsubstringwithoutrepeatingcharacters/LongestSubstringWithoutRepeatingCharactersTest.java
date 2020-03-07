package com.github.msaxena.leetcode.longestsubstringwithoutrepeatingcharacters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test(timeout = 1000)
    public void testExample1() {
        var solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "abcabcbb";
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test(timeout = 1000)
    public void testExample2() {
        var solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "bbbbbbbb";
        int expected = 1;
        int actual = solution.lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test(timeout = 1000)
    public void testExample3() {
        var solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "pwwwkew";
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(input);
        assertEquals(expected, actual);

    }

    @Test(timeout = 1000)
    public void testEmptyString() {
        var solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "";
        int expected = 0;
        int actual = solution.lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test(timeout = 1000)
    public void testSingleChar() {
        var solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "a";
        int expected = 1;
        int actual = solution.lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test(timeout = 1000)
    public void testCapString() {
        var solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "ab c";
        int expected = 4;
        int actual = solution.lengthOfLongestSubstring(input);
        assertEquals(expected, actual);
    }


}