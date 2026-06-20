package com.example;

public class ManipulacionCadenas {
    public static void demostrarConcatenacion() {
        // TODO
        String nombre = "Fabian";
        String apellido = "Hernandez";

        String nombreCompleto = nombre + " " + apellido;

        System.out.println("Nombre completo: " + nombreCompleto);

    }

    public static void demostrarMetodosUtiles() {
        // TODO
        String frase = "   Java es genial   ";

        System.out.println("Original: '" + frase + "'");
        System.out.println("Sin espacios: '" + frase.trim() + "'");

        String nuevaFrase = frase.replace("genial", "fácil");
        System.out.println("Reemplazo: " + nuevaFrase);

        String[] palabras = frase.trim().split(" ");

        System.out.println("Palabras:");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void demostrarInmutabilidad() {
        // TODO
        String texto = "Hola";

        String nuevoTexto = texto.replace("Hola", "Adiós");

        System.out.println("Texto original: " + texto);
        System.out.println("Nuevo texto: " + nuevoTexto);
    }

    public static void usarStringBuilder() {
        // TODO

        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("es ");
        sb.append("muy ");
        sb.append("útil.");

        System.out.println(sb.toString());
    }

}