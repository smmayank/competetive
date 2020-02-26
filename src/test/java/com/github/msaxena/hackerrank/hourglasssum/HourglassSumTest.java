package com.github.msaxena.hackerrank.hourglasssum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HourglassSumTest {

    @Test
    public void testInput00() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            { 1, 1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0 },
            { 1, 1, 1, 0, 0, 0 },
            { 0, 0, 2, 4, 4, 0 },
            { 0, 0, 0, 2, 0, 0 },
            { 0, 0, 1, 2, 4, 0 },
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(19, result);
    }

    @Test
    public void testInput01() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            { 1,  1,  1,  0,  0,  0 },
            { 0,  1,  0,  0,  0,  0 },
            { 1,  1,  1,  0,  0,  0 },
            { 0,  9,  2, -4, -4,  0 },
            { 0,  0,  0, -2,  0,  0 },
            { 0,  0, -1, -2, -4,  0 },
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(13, result);
    }

    @Test
    public void testInput08() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            { -9, -9, -9,  1,  1,  1 },
            {  0, -9,  0,  4,  3,  2 },
            { -9, -9, -9,  1,  2,  3 },
            {  0,  0,  8,  6,  6,  0 },
            {  0,  0,  0, -2,  0,  0 },
            {  0,  0,  1,  2,  4,  0 },
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(28, result);
    }

    @Test
    public void testAllNegative() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            { -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1 },
            { -1, -1, -1, -1, -1, -1 },
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(-7, result);
    }

    @Test
    public void testBareMinimum() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            { 1, 1, 1 },
            { 1, 1, 1 },
            { 1, 1, 1 },
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(7, result);
    }

    @Test
    public void testSmallRow() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            { 1, 1, 1 },
            { 1, 1, 1 },
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(0, result);
    }

    @Test
    public void testSmallCol() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            { 1, 1 },
            { 1, 1 },
            { 1, 1 },
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(0, result);
    }

    @Test
    public void testUnevenArray() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            { 1, 1, 1 },
            { 1, },
            { 1, 1, 1 },
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(0, result);
    }

    @Test
    public void testUnevenArraCalculable() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            { 1, 1, 1 },
            { 1, 1 },
            { 1, 1, 1 },
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(7, result);
    }

    @Test
    public void testEmptyArray() {
        HourglassSum hourglassSum = new HourglassSum();
        int[][] arr = {
            {},
            {},
            {},
        };
        int result = hourglassSum.hourglassSum(arr);
        assertEquals(0, result);
    }

}
