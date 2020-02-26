package com.github.msaxena.hackerrank.util;

public final class RangeUtil {

    /**
     * Util method to check if the value in range
     *
     * @param value value needs to be checked
     * @param begin starting value inclusive
     * @param end   end value inclusive
     * @return true if in between false otherwise
     */
    public static boolean isInBetween(int value, int begin, int end) {
        if (begin > end) {
            return isInBetween(value, end, begin);
        }
        if (value < begin) {
            return false;
        }
        return value <= end;
    }
}
