/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pildoras.java;
import javax.swing.JOptionPane;

/**
 *
 * @author m.parra.davila
 */
public class EntradaJOptionPane {
    
    public static void main (String[] args){
        
        String nombre = JOptionPane.showInputDialog("Cual es tu nombre");
      int  edad = Integer.parseInt(JOptionPane.showInputDialog("Cual es tu edad?"));
      edad++;
        System.out.println("Bienvenido+"+ nombre +"  el año que viene tendras "+ (edad) + " de edad y  podras pasar");

        //Este metodo le da formato a los numeros
        
        double numero = 1000.0;
        System.out.printf("%1.3f",numero/3);
        String num1 = JOptionPane.showInputDialog("introduce otro numero:");
        double num2 =  Double.parseDouble(num1);
        System.out.print("La raiz de " + num2 + " es ");
        System.out.printf("%1.2f",Math.sqrt(num2));
        System.out.printf("%1.4f",Math.sqrt(num2));

               
    }
}
