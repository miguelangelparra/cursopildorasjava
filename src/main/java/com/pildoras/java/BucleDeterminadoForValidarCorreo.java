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

public class BucleDeterminadoForValidarCorreo {

    public static void main(String[] args) {

        int arroba = 0;
        boolean punto = false;
        
        String email = JOptionPane.showInputDialog("Introduce mail:");
        System.out.println(email.length());

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                arroba++;
            }
            if(email.charAt(i)=='.'){
                punto = true;
            }
        }
        if (arroba==1 && punto) {
            System.out.println("Tu email es correcto");
        } else {
            System.out.println("Tu email es incorrecto");
        }

    }
}
