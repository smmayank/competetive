package com.github.msaxena.leetcode.longestsubstringwithoutrepeatingcharacters;

/**
 * @see <a href="LeetCode">https://leetcode.com/problems/longest-substring-without-repeating-characters/</a>
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String input) {
        char[] chars = input.toCharArray();
        int begin = 0;
        int end = 0;
        int max = 0;
        int[] hash = new int[256];
        while (begin <= end && end < chars.length) {
            char beginChar = chars[begin];
            char endChar = chars[end];
            if (hash[endChar] == 0) {
                // This is the first occurrence in the window
                hash[endChar]++;
                end++;
            } else {
                // Already exist shorten window
                hash[beginChar]--;
                begin++;
            }
            max = Math.max(max, end - begin);
        }
        return max;
    }
}
