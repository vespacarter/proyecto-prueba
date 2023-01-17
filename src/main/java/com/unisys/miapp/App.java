package com.unisys.miapp;

public class App {
    public static void main(String[] args) {
        int numero = 35;
        short marianico = 2;
        long gasol = 1000000000;
        boolean independencia = false;
        double presupuesto = 7.9;
        float longitud = 2.5f;
        long suma = gasol + marianico;
        System.out.println(suma);
        //* Ejercicios Estructuras de control *//

        //* Ejercicio 4

        var i = 1;
        while (i <= 10) {
            System.out.println("While Vuelta numero: " + i);
            i++;
        }

        //*Ejercicio 5
        i = 1;
        do {
            System.out.println("Do-While Vuelta numero: " + i);
            i++;
        } while (i <= 10);

        //* Ejercicio 6

        for (i = 0; i <= 10; i++) {
            System.out.println("For Vuelta numero: " + i);
        }

        //* ejercicio 7
        int edad = 21;
        if (edad >= 18) {
            System.out.println("Puede conducir un coche");
        } else {
            System.out.println("NO puede conducir un coche");
        }

        //* Ejercicio 8
        switch (edad) {
            case 18:
                System.out.println("Puede condudir un coche");
                break;
            case 21:
                System.out.println("Puede beber en USA");
                // break;
            default:
                System.out.println("Su edad es: " + edad);
                break;
        }
        //* Ejercicio 9
 /*       var i = 1;
       label: while(i<=10){
            System.out.println("While Vuelta numero: " + i);
           i++;
            if
        }*/

        //* Ejercicios de Arrays *//

        //* Ejercicio 4
        int[] miArray = new int[4];

        //* Ejercicio 5

        miArray[0] = 1;
        miArray[1] = 2;
        miArray[2] = 3;
        miArray[3] = 4;

        //* Ejercicio 6

    //*    int i;
        for (i = 0; i < miArray.length; i++) {

            System.out.println(miArray[i]);
        }

        //* Ejercicio 7
        i = 0;
        do {
            System.out.println("Do-While Valores miArray " + miArray[i]);
            i++;
        } while (i < miArray.length);

        //* Ejercicio 8

    }
}

