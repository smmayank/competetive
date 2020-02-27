package com.github.msaxena.hackerrank.util;

import static com.github.msaxena.hackerrank.util.RangeUtil.isInBetween;

public class ArrayUtil {

    /**
     * Get the value from an array default if not specified
     *
     * @param index        Index of the value
     * @param array        array from which the value is required
     * @param defaultValue default value if index is out of range
     * @param <T>          Type of value required
     * @return value or default value
     */
    public static <T> T getVal(int index, T[] array, T defaultValue) {
        return array != null && isInBetween(index, 0, array.length - 1)
            ? array[index]
            : defaultValue;
    }

    /**
     * Get the value from an array default if not specified
     *
     * @param index        Index of the value
     * @param array        array from which the value is required
     * @param defaultValue default value if index is out of range
     * @return value or default value
     */
    public static int getVal(int index, int[] array, int defaultValue) {
        return array != null && isInBetween(index, 0, array.length - 1)
            ? array[index]
            : defaultValue;
    }
}
