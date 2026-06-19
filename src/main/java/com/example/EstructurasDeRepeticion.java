package com.example;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        // TODO
        //imprime una cuenta regresiva desde 10 hasta 1 usando un while
        int contador = 10;
        while (contador > 0) {
            System.out.println(contador);
            contador--;
        }
    }

    public static void ejemploDoWhile() {
        // TODO
        //pide un nummero al usuario hasta que escriba 0
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número : ");
            numero = scanner.nextInt();
        } while (numero != 0);
    }

    public static void ejemploForClasico() {
        // TODO
        //imprime los primeros 10 numeros pares usando un for clasico
        for (int i = 0; i < 20; i += 2){
            System.out.println(i);
        }
    }

    public static void ejemploForAnidado() {
        // TODO
        //crea una tabla de multiplicar completa
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();// salto de línea después de cada fila
        }
    }

    public static void ejemploBreakContinue() {
        // TODO
    }

    public static void ejemploEtiquetas() {
        // TODO
    }
}