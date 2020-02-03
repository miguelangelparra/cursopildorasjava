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
public class Arrays01 {

    public static void main(String[] args) {
        //Declaracion de Array con 5 elementos
        int[] miArray = new int[5];
        //Otra forma de declarar y una inicializacion en la misma linea
        int miArray2[] = {1, 5, 32, 90, 43};

//Inicializacion de los elementos del Array
        miArray[0] = 5;
        miArray[1] = 14;
        miArray[2] = 34;
        miArray[3] = 45;
        miArray[4] = 53;
//Para entrar al valor se debe colocar el nombre y la posicion que se quiere entre []
        System.out.println(miArray[4]);

        System.out.println("Array 1");

        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Indice " + i + ": " + miArray[i]);
        }

        System.out.println("Array 2");

        int i = 0;
        while (i < miArray2.length) {
            System.out.println("Indice " + i + ": " + miArray[i]);
            i++;
        }
    }
}
