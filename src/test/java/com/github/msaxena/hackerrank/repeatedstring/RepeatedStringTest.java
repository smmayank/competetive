package com.github.msaxena.hackerrank.repeatedstring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RepeatedStringTest {

    @Test
    public void testScenario1() {
        RepeatedString solution = new RepeatedString();
        String string = "aba";
        long number = 10;
        long result = solution.repeatedString(string, number);
        assertEquals(7, result);
    }

    @Test
    public void testScenario2() {
        RepeatedString solution = new RepeatedString();
        String string = "a";
        long number = 1000000000000L;
        long result = solution.repeatedString(string, number);
        assertEquals(1000000000000L, result);
    }
}
