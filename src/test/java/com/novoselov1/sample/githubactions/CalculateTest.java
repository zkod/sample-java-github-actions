package com.novoselov1.sample.githubactions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest {
    /**
     * Sum arg 4 and 5.
     */
    @Test
    public void whenSum4And5ThenResult9() {
        Calculate calculate = new Calculate();
        final int a = 4;
        final int b = 5;
        final int expected = 9;
        assertEquals(expected, calculate.sum(a, b));
    }
}
