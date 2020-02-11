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
public class ConstantesFinalMetodoFinal {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado ("Miguelangel");
        Empleado empleado2 = new Empleado ("Daniel");
        Empleado empleado3= new Empleado ("Maria");
        Empleado empleado4=new Empleado ("Nery");
        
        empleado1.setSeccion("Logistica");
        
        empleado4.setSeccion("RRHH");
        System.out.println( empleado1.getDatos() +"\n"  +
                empleado2.getDatos() +"\n"+
                empleado3.getDatos() +"\n"+
                empleado4.getDatos() +"\n"); 
        System.out.println(Empleado.getIdSiguiente());
    }
}

class Empleado {
//Final vuelva a la variable una constante. Inmodificable . Se suele asignar en el constructor
   private static int idSiguiente =1; 
    private final int id;
    private final String nombre;
    private String seccion;

    public Empleado( String nombre) {
       this.id=idSiguiente;
        this.nombre = nombre;
        this.seccion = "Administracion";
        
        idSiguiente++;
    }

    public String getNombre() {
        return "El nombre es: " + this.nombre;
    }

    public String getSeccion(){
        return "Su seccion es: " +this.seccion;
    }
    public void setSeccion(String session) {
        this.seccion = session;
    }
    
    public String getId(){
    return "Su id es: " + this.id; }

    public String getDatos(){
        return "El nombre del trabajo es:" + this.getNombre() + " y " + this.getSeccion() + ". " + getId() ;
    }
    
    public static String getIdSiguiente(){
    return "El idSiguiente es " + idSiguiente;}
}
