package com.example;

public class ArreglosBidimensionales {
    public static void declararCrearMatrices() {
        // TODO
        int[][] matriz = {
                { 1, 2 },
                { 3, 4 }
        };

        System.out.println("Matriz 2x2:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void recorrerMatriz() {
        // TODO
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("La suma de la matriz es: " + suma);

    }

    public static void ejemploUsosTipicos() {
        // TODO
        String[][] estudiantes = {
                { "Juan", "Aprobó" },
                { "Ana", "Aprobó" },
                { "Pedro", "Reprobó" }
        };

        System.out.println("Lista de estudiantes:");

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i][0] + " - " + estudiantes[i][1]);
        }

    }
}