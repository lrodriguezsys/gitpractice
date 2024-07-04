package com.ejemplo;

public class HolaMundo {
    public String saludar() {
        return "Hola Mundo";
    }

    public static void main(String[] args) {
        HolaMundo holaMundo = new HolaMundo();
        System.out.println(holaMundo.saludar());
    }
}
