package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros() {
        // TODO
        // explorar los limites de byte, short, int, long
        byte b = 127; // maximo valor para byte
        short s = 32767; // maximo valor para short
        int i = 2147483647; // maximo valor para int
        long l = 9223372036854775807L; // maximo valor para long
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);  
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
    }

    public static void demostrarFlotantes() {
        // TODO
        // representa el precio de un cafe usando float y double
        float precioCafeFloat = 2.99f; // se necesita la 'f' para indicar que es un float
        double precioCafeDouble = 2.99; // por defecto es double
        System.out.println("Precio de café (float): " + precioCafeFloat);
        System.out.println("Precio de café (double): " + precioCafeDouble);
    }

    public static void demostrarCaracteres() {
        // TODO
        // guarda tub inicial
        char letraInicial = 'F';
        System.out.println("Letra Inicial: " + letraInicial);   
    }

    public static void demostrarBooleanos() {
        // TODO
        boolean luzEncendida = true;
        boolean luzApagada = false;
        System.out.println("Luz encendida: " + luzEncendida);
        System.out.println("Luz apagada: " + luzApagada);
    }

    public static void demostrarValoresPorDefecto() {
        // TODO
        // demuestra que pasa si usas una variable local sin inicializar
        int numero; // variable local sin inicializar
        //System.out.println("Número sin inicializar: " + numero); // Esto causará un  error de conpilación
        
    }
}