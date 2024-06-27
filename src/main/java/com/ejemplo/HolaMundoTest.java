package com.ejemplo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HolaMundoTest {
    @Test
    public void testSaludar() {
        HolaMundo holaMundo = new HolaMundo();
        assertEquals("Hola Mundo", holaMundo.saludar());
    }
}
