/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Excepciones.EstacionExcepcion;

/**
 *
 * @author Estudiante
 */
public class Ciudad {
    protected String nombre;
    private EstMet[] estaciones;
    
    public Ciudad(EstMet[] estaciones, String nombre) throws EstacionExcepcion{
        this.nombre = nombre;
        if(estaciones.length<3){
            throw new EstacionExcepcion();
        }
        this.estaciones = estaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstMet[] getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(EstMet[] estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", estaciones=" + estaciones + '}';
    }
          
    
    
}
