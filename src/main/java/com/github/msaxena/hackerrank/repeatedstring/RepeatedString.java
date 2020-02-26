package com.github.msaxena.hackerrank.repeatedstring;

public class RepeatedString {

    public long repeatedString(String s, long n) {
        long sLength = s.length();
        int allALength = s.chars().filter(c -> 'a' == c).toArray().length;
        long result = n / sLength  * allALength;
        long left = n % sLength;
        result += s.chars().limit(left).filter(c -> 'a' == c).toArray().length;
        return result;
    }
}
