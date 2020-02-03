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
public class ArraysBidimensionales {

    public static void main(String[] args) {
        int[][] arrayBidimensional = new int[5][4];

        arrayBidimensional[0][0] = 15;
        arrayBidimensional[0][1] = 10;
        arrayBidimensional[0][2] = 4;
        arrayBidimensional[0][3] = 43;

        arrayBidimensional[1][0] = 3;
        arrayBidimensional[1][1] = 5;
        arrayBidimensional[1][2] = 6;
        arrayBidimensional[1][3] = 4;

        arrayBidimensional[2][0] = 34;
        arrayBidimensional[2][1] = 54;
        arrayBidimensional[2][2] = 65;
        arrayBidimensional[2][3] = 78;

        arrayBidimensional[3][0] = 22;
        arrayBidimensional[3][1] = 11;
        arrayBidimensional[3][2] = 33;
        arrayBidimensional[3][3] = 44;

        arrayBidimensional[4][0] = 545;
        arrayBidimensional[4][1] = 543;
        arrayBidimensional[4][2] = 13;
        arrayBidimensional[4][3] = 12312;

        System.out.println("El valor de la posicion 4,0 es : " + arrayBidimensional[4][0]);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("El valor en " + i + "," + j + ": " + arrayBidimensional[i][j]);
            }

        }
    }
}
