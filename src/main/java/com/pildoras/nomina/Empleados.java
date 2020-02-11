/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pildoras.nomina;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author m.parra.davila
 */
public class Empleados {

    public static void main(String[] args) {
/*//Una Forma
        
        Empleado empleado1=new Empleado("Miguelangel Parra",34000.03,2020,6,11);
Empleado empleado2 = new Empleado ("Maria Cristina",25000.93,2019,9,11);
Empleado empleado3= new Empleado ("Nery DAvila",300000.98,1958,10,10);

empleado1.setSueldo(15);
empleado2.setSueldo(4.3);
empleado3.setSueldo(84);

System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() + " Fecha de Alta: " + empleado1.getSueldo() );
System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo() + " Fecha de Alta: " + empleado2.getSueldo() );
System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() + " Fecha de Alta: " + empleado3.getSueldo() );*/
    

//Otra Forma
    Empleado[] misEmpleados=new Empleado[4];
    misEmpleados[0]=new Empleado("Miguelangel",45000,1990,12,3);
    misEmpleados[1]=new Empleado("Maria Cristina",35000,1992,11,12);
    misEmpleados[2]=new Empleado("Miguelangel",145000,1980,5,15);
    misEmpleados[3]=new Empleado("Jesus Alberto");
    
    for(int i = 0 ; i<4;i++){
        misEmpleados[i].setSueldo(5);
    }
    for(Empleado empleado:misEmpleados){
        System.out.println("Nombre: "+ empleado.getNombre()+ " Sueldo: " + empleado.getSueldo() + " Fecha de Alta: " + empleado.getAltaContrato());
    }
    }
}

class Empleado {

    public Empleado( String nombre, double sueldo, int anho, int mes, int dia) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar fechaAlta = new GregorianCalendar(anho, mes - 1, dia);
        this.altaContrato = fechaAlta.getTime();

    }

    public Empleado(String nombre){
this(nombre,20000,2020,1,1);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public Date getAltaContrato(){
        return this.altaContrato;
    }
    
    public void setSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
