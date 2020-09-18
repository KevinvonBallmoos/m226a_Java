package edu.ab06_Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    Konto konto;

    @BeforeEach
    void setUp() {
        konto = new Konto(0.01, "Kevin");
    }

    @Test
    void einzahlen() {

        double expected = 500;
        konto.einzahlen(expected);
        double result = konto.getSaldo();
        assertEquals(expected, result);
    }

    @Test
    void verzinsen(){

        double expected = 75000;
        double days = 365;

        konto.einzahlen(expected);
        konto.verzinsen(days);

        double result = konto.getSaldo();

        expected += expected * (konto.getZinsSatz() / 2)  * days / 365;

        assertEquals(expected, result);
    }

}
