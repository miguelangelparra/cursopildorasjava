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
public class Furgoneta extends Coche {
    private int capacidad_carga;
    private int plazas_extras;
    
    public Furgoneta (int capacidad_carga, int plazas_extras){
super(); //Llama al constructor de la clase padre
this.capacidad_carga = capacidad_carga;
this.plazas_extras=plazas_extras;

    }
}