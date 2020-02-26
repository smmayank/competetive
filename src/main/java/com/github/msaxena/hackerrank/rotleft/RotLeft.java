package com.github.msaxena.hackerrank.rotleft;

public final class RotLeft {

    int[] rotLeft(int[] a, int d) {
        if (null == a || a.length <= 0) {
            return new int[0];
        }
        int length = a.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = a[(i + d) % length];
        }
        return result;
    }

}
