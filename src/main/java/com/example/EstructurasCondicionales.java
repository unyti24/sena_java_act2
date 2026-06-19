package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        // TODO
        // valida sin usuario tiene la edad minima para votar
        int edad = 18;
        if (edad >= 18) {
            System.out.println("El usuario tiene la edad mínima para votar.");
        }

    }

    public static void ejemploIfElse() {
        // TODO
        int edad2 = 15;
        if (edad2 >= 18) {
            System.out.println("El usuario tiene la edad mínima para votar.");
        } else {
            System.out.println("El usuario no tiene la edad mínima para votar.");
        }
    }

    public static void ejemploIfElseIfElse() {
        // TODO
        int edad3 = 70;
        if (edad3 < 18) {
            System.out.println("El usuario es menor de edad.");
        } else if (edad3 >= 18 && edad3 < 65) {
            System.out.println("El usuario es adulto.");
        } else {
            System.out.println("El usuario es adulto mayor.");
        }
    }

    public static void ejemploSwitch() {
        // TODO
        // crea un selector de dias de la semana segun un numero del 1 al 7
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día no válido.");
        }
    }

    public static void ejemploSwitchExpression() {
        // TODO
        // usa una sintaxis de java +14 (->) para asignar un valor basado en una estacion
        String estacion = "Verano";

        String mensaje = switch (estacion) {
            case "Primavera" -> "Las flores florecen";
            case "Verano" -> "Hace mucho calor";
            case "Otoño" -> "Caen las hojas";
            case "Invierno" -> "Hace mucho frío";
            default -> "Estación no válida";
        };

        System.out.println(mensaje);
    }
}