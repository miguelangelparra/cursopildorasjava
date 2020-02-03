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
public class Array02NumerosAleatorios {

    public static void main(String[] args) {
        int[] arrayNumerosAleatorios = new int[150];
        for (int i = 0; i < arrayNumerosAleatorios.length; i++) {
            arrayNumerosAleatorios[i] = (int) Math.round(Math.random() * 100);
        }

        for (int numero : arrayNumerosAleatorios) {
            System.out.print(numero + " ");
        }
    }
}
