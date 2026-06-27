package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValueCheckerTest {

    private ValueChecker checker;

    @Before
    public void setUp() {
        System.out.println("Setup: Creating ValueChecker object");
        checker = new ValueChecker();
    }

    @Test
    public void testDivisibleBy50() {

        int number = 51;

        boolean result = checker.isDivisibleBy50(number);

        assertTrue(result);
    }

    @Test
    public void testNotDivisibleBy50() {

        int number = 125;

        boolean result = checker.isDivisibleBy50(number);

        assertFalse(result);
    }

    @After
    public void tearDown() {
        System.out.println("Teardown: Cleaning up");
        checker = null;
    }
}