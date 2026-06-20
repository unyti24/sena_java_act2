package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar() {
        // TODO
        String[] peliculas = {
                "Avengers",
                "Titanic",
                "Cars",
                "Avatar",
                "Spiderman"
        };

        System.out.println("Películas favoritas:");
        for (String pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public static void mostrarLongitud() {
        // TODO
        String[] peliculas = {
                "Avengers",
                "Titanic",
                "Cars",
                "Avatar",
                "Spiderman"
        };

        System.out.println("La longitud del arreglo es: " + peliculas.length);

    }

    public static void recorrerConForClasico() {
        // TODO
        String[] peliculas = {
                "Avengers",
                "Titanic",
                "Cars",
                "Avatar",
                "Spiderman"
        };

        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("Película " + (i + 1) + ": " + peliculas[i]);
        }
    }

    public static void recorrerConForEach() {
        // TODO
        String[] peliculas = {
                "Avengers",
                "Titanic",
                "Cars",
                "Avatar",
                "Spiderman"
        };

        for (String pelicula : peliculas) {
            System.out.println(pelicula);
        }

    }

    public static int[] arrayComoParametroYRetorno(int[] array) {
        // TODO
           int[] invertido = new int[array.length];

    for (int i = 0; i < array.length; i++) {
        invertido[i] = array[array.length - 1 - i];
    }

    return invertido;
    }
}