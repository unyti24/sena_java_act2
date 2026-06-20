package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void leerVariosTipos() {
        // TODO
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese un número decimal: ");
        double numero = sc.nextDouble();

        System.out.println("Texto: " + texto);
        System.out.println("Número decimal: " + numero);
    }

    public static void manejarSaltoDeLineaPendiente() {
        // TODO
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        sc.nextLine(); // Limpia el salto de línea pendiente

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}