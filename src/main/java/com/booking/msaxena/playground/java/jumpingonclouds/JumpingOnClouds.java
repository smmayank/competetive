package com.booking.msaxena.playground.java.jumpingonclouds;

public class JumpingOnClouds {

    private boolean isValidIndex(int[] c, int index) {
        if (index < c.length) {
            return c[index] == 0;
        }
        return false;
    }

    public int jumpingOnClouds(int[] c) {
        int jumps = -1;
        int index = 0;
        while (index < c.length) {
            if (isValidIndex(c, index + 2)) {
                index += 2;
            } else {
                index += 1;
            }
            ++jumps;
        }
        return jumps;
    }
}
