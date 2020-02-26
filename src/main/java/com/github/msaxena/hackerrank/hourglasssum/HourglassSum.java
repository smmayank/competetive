package com.github.msaxena.hackerrank.hourglasssum;

import com.github.msaxena.hackerrank.util.RangeUtil;

public class HourglassSum {

    private static final int[][] summer = {
        { 0, 0 }, { 0, 1 }, { 0, 2 },
                  { 1, 1 },
        { 2, 0 }, { 2, 1 }, { 2, 2 },
    };

    private boolean isValid(int[][] arr, int row, int col) {
        return RangeUtil.isInBetween(row, 0, arr.length - 1)
            && RangeUtil.isInBetween(col, 0, arr[row].length - 1);
    }

    private int getHourglassSum(int[][] arr, int row, int col) {
        int sum = 0;
        for (int[] ints : summer) {
            if (isValid(arr, row + ints[0], col + ints[1])) {
                sum += arr[row + ints[0]][col + ints[1]];
            } else {
                return 0;
            }
        }
        return sum;
    }

    public int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        boolean executed = false;
        for (int row = 0; row < arr.length - 2; row++) {
            for (int col = 0; col < arr[row].length - 2; col++) {
                int currentSum = getHourglassSum(arr, row, col);
                max = Math.max(max, currentSum);
                executed = true;
            }
        }
        return executed ? max: 0;
    }
}
