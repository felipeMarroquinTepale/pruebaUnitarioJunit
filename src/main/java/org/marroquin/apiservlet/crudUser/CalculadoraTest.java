package org.marroquin.apiservlet.crudUser;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSumar(){
        System.out.println("Prueba");
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2,3);

        assertEquals(5, resultado);
    }
}
