package edu.ab05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int expected = 2;
        int result = calculator.calc(12, 6, 4);

        assertEquals(expected, result);
    }

    @Test
    void testException() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            int result = calculator.calc(12, 3, 6);
        });
    }

    @Test
    void testMinus(){
        int expected = 0;
        int result = calculator.calc(50, -2, 5);

        assertEquals(expected, result);
    }

    @Test
    void testDoubleMinus(){
        int expected = 100;
        int result = calculator.calc(-50, -2, 3);

        assertEquals(expected, result);
    }

    @Test
    void testZero(){
        int expected = 0;
        int result = calculator.calc(50, 0, 4);

        assertEquals(expected, result);
    }
}