/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pildoras.java;

import java.util.Scanner;

/**
 *
 * @author m.parra.davila
 */
public class condicional01 {
    
    public static void main(String[] args){
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();
        if(edad>18){
            System.out.println("Tu edad es " + edad + " , eres mayor de edad.");
        }else if (edad==18){
                        System.out.println("ummmm, tu edad es "+ edad + " ,estas en la frontera");
        }else{
            System.out.println("Oh! Lo siento, tu edad es "+ edad + " ,eres menor de edad y no puedes entrar");
        }
    }
}
