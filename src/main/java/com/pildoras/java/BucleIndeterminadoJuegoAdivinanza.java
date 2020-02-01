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
import java.util.Scanner;

public class BucleIndeterminadoJuegoAdivinanza {

    public static void main(String[] args) {
        //Genera numero aleatorio
        System.out.println(Math.random());
        //Otra Forma de parsear
        int numeroAleatorio = (int) (Math.random() * 100);
        System.out.println(numeroAleatorio);

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while (numero != numeroAleatorio) {
            System.out.println("Intruduce un numero, por favor: ");
            numero = entrada.nextInt();
            intentos++;
            if (numero > numeroAleatorio) {
                System.out.println("Mas bajo");
            } else if (numero < numeroAleatorio) {
                System.out.println("Mas alto");
            }
        }
        System.out.println("Numero Adivinado en " + intentos + " intentos. Excellent Work! ");
    }
}

