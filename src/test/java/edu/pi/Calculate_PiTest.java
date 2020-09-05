package edu.pi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculate_PiTest {
    Calculate_Pi calculate_pi;

    @BeforeEach
    void setUp() {
        calculate_pi = new Calculate_Pi();
    }

    @Test
    void calculate() {

      assertEquals(3.141, calculate_pi.calculate(0,1,1), 0.01);

    }




}