/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiante
 */
public class EstMet {
    private String nombre;
    private String ubicacion;
    private String fecha;
    private Sensores[] sensores;

    public EstMet(String nombre, String ubicacion, String fecha, Sensores[] sensores) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.sensores = sensores;
    }



    public Sensores[] getSensores() {
        return sensores;
    }

    public void setSensores(Sensores[] sensores) {
        this.sensores = sensores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "EstMet{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", fecha=" + fecha + '}';
    }
    
     
    
    
}
