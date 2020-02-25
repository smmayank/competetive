package com.booking.msaxena.playground.java.hourglasssum;

import com.booking.msaxena.playground.java.util.RangeUtil;

public class HourglassSum {

    private static final int[][] summer = {
        { 0, 0 }, { 0, 1 }, { 0, 2 },
                  { 1, 1 },
        { 2, 0 }, { 2, 1 }, { 2, 2 },
    };

    private boolean isValid(int[][] arr, int row, int col) {
        return RangeUtil.isInbetween(row, 0, arr.length - 1)
            && RangeUtil.isInbetween(col, 0, arr[row].length - 1);
    }

    private int getHourglassSum(int[][] arr, int row, int col) {
        int sum = 0;
        for (int a = 0; a < summer.length; a++) {
            if (isValid(arr, row + summer[a][0], col + summer[a][1])) {
                sum += arr[row + summer[a][0]][col + summer[a][1]];
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
