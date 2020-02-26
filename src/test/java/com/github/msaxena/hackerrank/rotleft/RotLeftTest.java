package com.github.msaxena.hackerrank.rotleft;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public final class RotLeftTest {

    @Test
    public void sampleOne() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] output = { 5, 1, 2, 3, 4 };
        int steps = 4;
        RotLeft solution = new RotLeft();
        int[] result = solution.rotLeft(input, steps);
        assertArrayEquals(output, result);
    }

}
