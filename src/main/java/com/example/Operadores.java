package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        // TODO
        // calcula el promedio de 3 notas escolares
        double nota1 = 85.5;
        double nota2 = 90.0;
        double nota3 = 78.0;
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio de las notas: " + promedio);
    }

    public static void demostrarIncrementoDecremento() {
        // TODO
        // compara el comportamiento de ++n vs n++ en una impresion
        int n = 5;
        System.out.println("Valor de n antes del incremento: " + n);
        System.out.println("Valor de n++: " + n++); // imprime 5, luego incrementa a 6
        System.out.println("Valor de n después de n++: " + n); // imprime 6
        n = 5; // reiniciar n
        System.out.println("Valor de n antes del incremento: " + n);
        System.out.println("Valor de ++n: " + ++n); // incrementa a 6, luego imprime 6
        System.out.println("Valor de n después de ++n: " + n); // imprime
    }

    public static void demostrarRelacionales() {
        // TODO
        // verifica si un numero es mayor que 10 y menor que 50
        int numero = 25;
        boolean esMayorQue10 = numero > 10;
        boolean esMenorQue50 = numero < 50;
        System.out.println("El número es mayor que 10: " + esMayorQue10);
        System.out.println("El número es menor que 50: " + esMenorQue50);
    }

    public static void demostrarLogicos() {
        // TODO
        int numero = 25;

        boolean estaEnRango = numero > 10 && numero < 50;
        boolean estaFueraDelRango = numero < 10 || numero > 50;
        boolean noEsMayorQue10 = !(numero > 10);

        System.out.println("¿Está entre 10 y 50?: " + estaEnRango);
        System.out.println("¿Está fuera del rango?: " + estaFueraDelRango);
        System.out.println("¿No es mayor que 10?: " + noEsMayorQue10);
    }

    public static void demostrarAsignacionCompuesta() {
        // TODO
        int numero = 10;

        numero += 5;
        System.out.println("Después de += 5: " + numero);

        numero -= 3;
        System.out.println("Después de -= 3: " + numero);

        numero *= 2;
        System.out.println("Después de *= 2: " + numero);

        numero /= 4;
        System.out.println("Después de /= 4: " + numero);
    }

    public static void demostrarOperadorTernario() {
        // TODO
        int numero = -8;

        String resultado = numero >= 0 ? "Positivo" : "Negativo";

        System.out.println(resultado);
    }
}