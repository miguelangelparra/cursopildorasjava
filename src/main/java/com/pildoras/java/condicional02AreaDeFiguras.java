/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pildoras.java;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author m.parra.davila
 */
public class condicional02AreaDeFiguras {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //\n quiebra la linea en un string, hace un salto de linea
        System.out.println("Elige una opcion: \n1: Cuadrado \n2:Rectangulo \n3:Triangulo \n4:Circulo");

        int figura = entrada.nextInt();

        switch (figura) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
                System.out.println("El area del Rectangulo es: " + base * altura);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura: "));
                System.out.println("El area del Triangulo es: " + (base * altura) / 2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
                System.out.print("El area del Circulo es: ");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;
            default:
                System.out.println("No seleccionaste una opcion correcta.");

        }

    }
}
