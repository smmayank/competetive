package com.booking.msaxena.playground.java.jumpingonclouds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JumpingOnCloudsTest {

    @Test
    public void testSample1() {
        JumpingOnClouds solution = new JumpingOnClouds();
        int[] input = { 0, 0, 1, 0, 0, 1, 0 };
        int val = solution.jumpingOnClouds(input);
        assertEquals(4, val);
    }

    @Test
    public void testSample2() {
        JumpingOnClouds solution = new JumpingOnClouds();
        int[] input = { 0, 0, 0, 0, 1, 0 };
        int val = solution.jumpingOnClouds(input);
        assertEquals(3, val);
    }

    @Test
    public void testSample3() {
        JumpingOnClouds solution = new JumpingOnClouds();
        int[] input = { 0, 0, 0, 1, 0, 0 };
        int val = solution.jumpingOnClouds(input);
        assertEquals(3, val);
    }
}
