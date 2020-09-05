package edu.ab01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    MyClass myClass;

    @BeforeEach
    void setUp() {
        myClass = new MyClass("Kevin", "von Ballmoos");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calcDivision() {
        assertEquals(10, myClass.calcDivision(50,5));
    }


}