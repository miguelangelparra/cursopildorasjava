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
public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public String getDatosGenerales() {
        return "La plataforma del vehiculo tiene: " + ruedas + "ruedas. "
                + "Mide " + largo / 1000
                + " metros con un ancho de " + ancho
                + " cm y el peso de su plataforma es " + peso
                + " Kg.";
    }

    public String getAncho() {
        return "El ancho de este coche es: " + this.ancho + "cm";
    }

    public int getPeso() { //Getter
        return this.peso;
    }

    public String getColor() {
        return "El color del coche es: " + color;
    }

    public void setColor(String color) {//Setter
        this.color = color;
    }

    public void setAsientos(String asientos_cuero) {
        
        this.asientos_cuero = asientos_cuero.equalsIgnoreCase("si");
    }
    
    public String getAsientos(){
        if (asientos_cuero==true){
            return "El coche tiene asientos de cuero";
        }else{
            return "El coche tiene asientos de tela";
        }
    }
    
    public void setClimatizador(String climatizador){
        this.climatizador = climatizador.equalsIgnoreCase("si");
    }
    public String getClimatizador(){
        if(climatizador==true){
            return "El Coche incorpora climatizador";
                     }else{
            return "El coche lleva aire acondicionado";
        }
    }
    
    public String peso_coche(){
        int peso_carroceria = 500;
        peso_total += peso +peso_carroceria;
        if(asientos_cuero==true){ peso_total += 50; }
        
        if(climatizador==true){peso_total+=20;}
        
        return "El Peso del Coche es: "+ peso_total;
    }
    
    public int precio_coche(){
        int precio_final= 10000;
        if(asientos_cuero==true){precio_final+=2000;}
        if(climatizador==true){precio_final+=1500;}
        return precio_final;
    }
}

