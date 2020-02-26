package com.github.msaxena.hackerrank.minimumsteps2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSteps2Test {

    @Test(timeout = 1000)
    public void testExample() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        int steps = solution.minimumSwaps(arr);
        assertEquals(5, steps);
    }

    @Test(timeout = 1000)
    public void testSample0() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {4, 3, 1, 2};
        int steps = solution.minimumSwaps(arr);
        assertEquals(3, steps);
    }

    @Test(timeout = 1000)
    public void testSample1() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {2, 3, 4, 1, 5};
        int steps = solution.minimumSwaps(arr);
        assertEquals(3, steps);
    }

    @Test(timeout = 1000)
    public void testSample2() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        int steps = solution.minimumSwaps(arr);
        assertEquals(3, steps);
    }

    @Test(timeout = 1000)
    public void testEmptyArray() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {};
        int steps = solution.minimumSwaps(arr);
        assertEquals(0, steps);
    }


    @Test(timeout = 1000)
    public void testSortedArray() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int steps = solution.minimumSwaps(arr);
        assertEquals(0, steps);
    }

    @Test(timeout = 1000)
    public void testInverseSortedArray() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {6, 5, 4, 3, 2, 1};
        int steps = solution.minimumSwaps(arr);
        assertEquals(3, steps);
    }

    @Test(timeout = 1000)
    public void testSingleArray() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {1};
        int steps = solution.minimumSwaps(arr);
        assertEquals(0, steps);
    }

    @Test(timeout = 1000)
    public void testDoubleArray() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {1, 2};
        int steps = solution.minimumSwaps(arr);
        assertEquals(0, steps);
    }

    @Test(timeout = 1000)
    public void testDoubleInverseArray() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {3, 2};
        int steps = solution.minimumSwaps(arr);
        assertEquals(1, steps);
    }

    @Test(timeout = 1000)
    public void testSameArray() {
        MinimumSteps2 solution = new MinimumSteps2();
        int[] arr = {1, 1};
        int steps = solution.minimumSwaps(arr);
        assertEquals(0, steps);
    }


}
