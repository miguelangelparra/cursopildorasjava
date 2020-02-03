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

public class BucleDeterminadoForFactorial {

    public static void main(String[] args) {
        Long resultado = 1L;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresas un numero: "));

        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }

        System.out.println("El facturial de " + numero + " es " + resultado);
    }

}
