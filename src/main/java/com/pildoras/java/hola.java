/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pildoras.java;

/**
 *
 * @author m.parra.davila
 */
public class hola {

    public static void main(String[] Args) {
        System.out.println("Hola Mundo!");

        int num1, num2, num3;
        num1 = 2;
        num2 = 450;
        num3 = num1 + num2;

        System.out.println(num3);

        String micadena = "Esto es una cadena ";

        System.out.println("La longitud de mi cadena es: " + micadena.length());

        System.out.println("La primera letra de micadena es: " + micadena.charAt(0));

        System.out.println("Lo que es : " + micadena.substring(5, 8));

        double numRandom = Math.random();

        System.out.println("Esto es un numero Random: " + numRandom);

        for (int i = 1; i <= 6; i++) {
            System.out.println("El valor de i es: " + i);
            if (i == 3) {
                System.out.println("El valor del bucle en su mitad es : " + i);
            }
        }

        int i = 0;
        while (i <= 5) {
            System.out.println("Este es el numero que renderiza con el while: " + i);
            i++;
        }
    }
}
