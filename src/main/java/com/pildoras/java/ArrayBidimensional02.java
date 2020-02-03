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
public class ArrayBidimensional02 {

    public static void main(String[] args) {
        int[][] arrayBidimensional = {
            {12, 123, 14, 52, 25},
            {234, 123, 54, 43, 55},
            {65, 654, 345, 64, 34},
            {675, 454, 222, 33, 44}
        };
        for (int[] fila : arrayBidimensional) {
            System.out.println();
            for (int numero : fila) {
                System.out.print(numero + " ");
            }
        }
    }

}
