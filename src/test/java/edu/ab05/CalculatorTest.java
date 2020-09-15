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
        int expected = 15;
        int result = calculator.calc(12, 6, 4);

        assertEquals(expected, result);
    }

    @Test
    void testException() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            int result = calculator.calc(12, 3, 6);
        });
    }
}