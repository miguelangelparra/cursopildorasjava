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
public class ArrayBidimensional03CalculoDeInteres {
    public static void main(String[] args) {
        double acumulado;
        double interes=1.10;
        
        double[][]saldos= new double [6][5];
                
        for (int i = 0; i < 6; i++) {
            saldos[i][0]=10000;
            acumulado=10000;
            
            for (int j = 1; j < 5; j++) {
                acumulado=acumulado*interes;
                saldos[i][j]=acumulado;
            }
            interes=interes+0.01;
        }
        
        for(double[]segunInteres:saldos){
            System.out.println();
            for(double saldo:segunInteres){
                System.out.printf("%1.2f",saldo);
                System.out.print(" ");
            }
        }
    }
}
