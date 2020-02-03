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
import javax.swing.JOptionPane;

public class BucleDeterminadoForEach {

    public static void main(String[] args) {

        String paises[] = new String[8];

        paises[0] = "Venezuela";
        paises[1] = "Argentina";
        paises[2] = "Colombia";
        paises[3] = "Belgica";
        paises[4] = "Irak";
        paises[5] = "Estado Unidos";
        paises[6] = "Brasil";
        paises[7] = "Inglaterra";

        String[] paises2 = new String[8];
        for (int i = 0; i < paises.length; i++) {
            System.out.println("Pais " + (i + 1) + " : " + paises[i]);
        }

        System.out.println("Recorrido con ForEach: ");

        int i = 1;
        //Este es el bucle for mejorado, se declara el tipo de elemento , se nombra el elemento arbitrariamente " : " el array
        for (String elemento : paises) {
            System.out.println("Pais " + i + " : " + elemento);
            i++;
        }
        //Llenado de matriz por JOptionPane
        for (int j = 0; j < 8; j++) {
            paises2[j] = JOptionPane.showInputDialog("introduce Pais " + (j+1));
        }
        i = 1;
        for (String pais : paises2) {
            System.out.println("Pais " + i + ": " + pais);
        }

    }
}
