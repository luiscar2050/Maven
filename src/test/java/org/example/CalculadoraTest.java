package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3), "La suma de 2 + 3 debería ser 5");
        assertEquals(0, calculadora.sumar(-1, 1), "La suma de -1 + 1 debería ser 0");
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.restar(3, 2), "La resta de 3 - 2 debería ser 1");
        assertEquals(-2, calculadora.restar(3, 5), "La resta de 3 - 5 debería ser -2");
    }
}
