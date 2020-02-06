/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pildoras.automoviles;

/**
 *
 * @author m.parra.davila
 */

import javax.swing.JOptionPane;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche miCoche =   new Coche(); //INSTANCIAR UNA CLASE, ESTO ES UN EJEMPLAR DE COCHE
        
        System.out.println("Este coche tiene : " + miCoche.getRuedas() + " ruedas."); //Acceso a propiedades de clases.
        
        System.out.println(miCoche.getDatosGenerales());
        
        miCoche.setColor(JOptionPane.showInputDialog("¿Que Color deseas?"));
        System.out.println(miCoche.getColor());
        
        miCoche.setAsientos(JOptionPane.showInputDialog("¿Quieres asientos de cuero?"));
        
        System.out.println(miCoche.getAsientos());
        
        miCoche.setClimatizador(JOptionPane.showInputDialog("¿Quieres climatizador?"));
        
        System.out.println(miCoche.getClimatizador());
        
        System.out.println(miCoche.peso_coche());
        
        System.out.println("El precio final es: "+ miCoche.precio_coche());
        
        
    }
    
}
