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

public class BucleIndeterminadoAccesoApp {

    public static void main(String[] args) {

        String contraseña = "Miguelangel";
        String pass = "";
        //equals compara dos cadenas de texto
        while (contraseña.equals(pass) == false) {
            pass = JOptionPane.showInputDialog("Introduce La contraseña");
            if (contraseña.equals(pass) == false) {
                System.out.println("Contraseña Incorrecta. Acceso denegado");
            }
        }
        System.out.println("Contraseña correcta! Acceso permitido");
    }
}
