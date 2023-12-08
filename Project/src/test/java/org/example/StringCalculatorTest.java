package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testSingleString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void testMoreThenTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,2,3"));
    }

    @Test
    public void testNewDelimetr() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2\n3"));
    }

    @Test
    public void testTwoDelimetrs() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
    }
    @Test
    public void testExtraDelimetr() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1\n"));
    }
}