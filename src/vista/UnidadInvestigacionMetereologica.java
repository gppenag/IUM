/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Excepciones.EstacionExcepcion;
import Logica.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class UnidadInvestigacionMetereologica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("IUM");

        PrintStream output = new PrintStream(f);
        output.println("Bogotá\n"
                +"3\n"
                +"679\n"
                +"2\n"
                +"06/11/2013 13 17 2 2\n"
                +"marcaSensor referencia"
                +"Boyaca\n"
                +"3\n"
                +"679\n"
                +"2\n"
                +"06/11/2013 13 17 2 2\n"
                +"marcaSensor2 referencia2"
                +"Bucaramanga\n"
                +"3\n"
                +"679\n"
                +"2\n"
                +"06/11/2013 13 17 2 2\n"
                +"marcaSensor3 referencia3");

        Scanner leer = new Scanner(f);

        
        while(leer.hasNext()){
        String nombre = leer.next();
        int numEst = leer.nextInt();
        String nomEstacion = leer.next();
        int numSen = leer.nextInt();
        String fecha = leer.next();
        double temp = leer.nextDouble();
        int cantAgua = leer.nextInt();
        int nivel = leer.nextInt();
        String marcaS = leer.next();
        String ref = leer.next();
        
         Sensores[] s1= new Sensores [numSen];
         s1[0]= new CargaElectrica(nivel,marcaS , ref, fecha);
         s1[1]= new AguaLluvia(marcaS, ref, fecha);
         s1[2]= new Temperatura(temp, marcaS, ref, fecha);
         EstMet[] e1 = new EstMet [numEst];
         e1[0] = new EstMet(nomEstacion, nombre, fecha, s1);
         try{
         Ciudad ciudad = new Ciudad(e1, nombre);
         }catch(EstacionExcepcion e){
             e.getMessage();
         }
        }     
    }
    
}
