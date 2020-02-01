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
public class BucleIndeterminadoPesoIdeal {
    public static void main(String[]args){
       
        String genero ="";
        do{
            genero = JOptionPane.showInputDialog("Introduce tu Genero (H/M)");
            //El metodo equalsIgnoreCase compara un string ignorando las mayusculas y minusculas
        }while(genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("H")==false);
        
        int altura =Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altuar en cm: "));
        int pesoIdeal = 0;
        if(genero.equalsIgnoreCase("H")){
            pesoIdeal=altura-110;
        }else if ( genero.equalsIgnoreCase("M")){
            pesoIdeal=altura-120;
        }
        System.out.println("Tu peso ideal es: "+pesoIdeal);
    }
    
}
