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
public class Temperatura extends Sensores {
    private double temp;

    public Temperatura(double temp, String marca, String referencia, String fechaInst) {
        super(marca, referencia, fechaInst);
        this.temp = temp;
    }

    @Override
    public String listar() {
      return  "Temperatura{" + "temp=" + temp + '}'+super.toString();  
    }
}
