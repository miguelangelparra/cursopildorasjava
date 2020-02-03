package com.pildoras.java;

import java.util.Scanner;

/**
 *
 * @author m.parra.davila
 */
public class scanner01IntroduceNombre {
    
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

System.out.println("Introduce tu nombre");
String nombre = entrada.nextLine();
System.out.println("Intruduce tu edad");
int edad = entrada.nextInt();
System.out.println("Bienvenido "+ nombre + " , sabemos que tu edad es: " + edad + "años. ");
    
System.out.println("Introduce tu salario: ");
double salario = entrada.nextDouble();
if(salario>40000.00){
    System.out.println("Vaya!, "+ nombre + " , ganas un monton! sigue adelante!");
}else{
        System.out.println("Vaya!, "+ nombre + " , ganas muy poco! es hora de cambiar de trabajo...");
}
    }
}
