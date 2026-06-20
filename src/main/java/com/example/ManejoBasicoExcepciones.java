package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        // TODO
        try {
            int a = 10;
            int b = 0;

            int resultado = a / b;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }

    public static void ejemploTryCatchInput() {
        // TODO
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();

            System.out.println("Número ingresado: " + numero);

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número entero.");

        }
    }

    public static void ejemploBloqueFinally() {
        // TODO
        try {

            System.out.println("Ejecutando el bloque try...");

        } finally {

            System.out.println("Este mensaje siempre se ejecuta (finally).");

        }
    }

    public static void evitarCierrePrograma() {
        // TODO
        try {

            int[] numeros = { 1, 2, 3 };

            System.out.println(numeros[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: La posición del arreglo no existe.");

        }

        System.out.println("El programa continúa ejecutándose.");
    }

}