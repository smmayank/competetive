package com.github.msaxena.hackerrank.minimumsteps2;

import jdk.nashorn.internal.runtime.logging.Logger;

import static com.github.msaxena.hackerrank.util.ArrayUtil.getVal;

public class MinimumSteps2 {

    public int minimumSwaps(int[] arr) {
        int index = 0;
        int swaps = 0;
        while (index < arr.length) {
            int previous = getVal(index - 1, arr, Integer.MIN_VALUE);
            int current = getVal(index, arr, Integer.MIN_VALUE);
            if (previous <= current) {
                index++;
                continue;
            }
            int left = index - 1;
            int right = current;
            while (right < arr.length && getVal(right, arr, Integer.MIN_VALUE) < previous) {
                right++;
            }

            right--;
            swap(arr, left, right);
            swaps++;
            index = 0;
        }
        return swaps;
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
