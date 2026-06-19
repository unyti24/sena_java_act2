package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        // TODO
        // pasa un int a un double sin usar operadores especiales 
        int numeroEntero = 42;
        double numeroDouble = numeroEntero; // conversión implícita de int a double
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número double: " + numeroDouble);
    }

    public static void demostrarCastingExplicito() {
        // TODO
        // transforma un double con decimales a un int. ¿que paso con los decimales?
        double numeroDouble = 4.93;
        int numeroEntero = (int) numeroDouble; // conversión explícita de double a int
        System.out.println("Número double: " + numeroDouble);
        System.out.println("Número entero: " + numeroEntero); // los decimales se pierden al convertir a int
    }

    public static void demostrarProblemasDePrecision() {
        // TODO
        //realiza un casting de un long gigante a un short. Observa el fenomeno de overflow
        long numeroLong = 32768; // un valor que excede el rango de short
        short numeroShort = (short) numeroLong; // conversión explícita de long a short
        System.out.println("Número long: " + numeroLong);
        System.out.println("Número short: " + numeroShort); // resultado inesperado debido al overflow
    }
}