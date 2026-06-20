package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        // TODO
        // crea un metodo que imprima un encabezado decorado
        System.out.println("================================");
        System.out.println("        Encabezado Decorado       ");
        System.out.println("================================");
    }

    public static void ejemploPasoParametros(String nombre) {
        // TODO
        // crea un metodo que reciba un nombre y lo imprima con un mensaje de bienvenida
        System.out.println("¡Bienvenido, " + nombre + "!");
    }

    public static int ejemploRetornoValores(String nombre) {
        // TODO
        // crea un metodo que reciba un nombre y devuelva un saludo formal
        String saludo = "Buenos días, " + nombre + ". Bienvenido.";
        System.out.println(saludo);
        return 0;
    }

    public static void ejemploSobrecarga() {
        // TODO
        // crea dos metodos area() uno para cuadros y otro para rectangulos
        // Área de un cuadrado (lado = 5)
        System.out.println("Área del cuadrado: " + area(5));

        // Área de un rectángulo (base = 8, altura = 4)
        System.out.println("Área del rectángulo: " + area(8, 4));
    }

    public static void ejemploSobrecarga(int n) {
        // TODO
        System.out.println("Ejemplo de sobrecarga con parámetro: " + n);
    }

    // Método para calcular el área de un cuadrado
    public static int area(int lado) {
        return lado * lado;
    }

    // Método sobrecargado para calcular el área de un rectángulo
    public static int area(int base, int altura) {
        return base * altura;
    }
}