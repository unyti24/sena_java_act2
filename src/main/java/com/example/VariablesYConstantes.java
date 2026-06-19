package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {        
        // TODO
        // Declarar variables
        int edad = 24;
        double estatura = 1.85;

        //mostrar en consola
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }

    public static void demostrarConvencionesNombres() {
        // TODO
        // declarar variables con camelCase
        String nombreCompleto = "Fabian Hernandez";
        System.out.println("Nombre Completo: " + nombreCompleto);
    }

    public static void demostrarConstantes() {
        // TODO
        // final para declarar constantes
        final double PI = 3.14159;
        // si se intenta modificar PI, se generará un error de compilación
        //ejemplo: PI = 3.14; // Esto causará un error
        System.out.println("Valor de PI: " + PI);
    }
}