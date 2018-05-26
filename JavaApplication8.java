/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication8;

import java.io.IOException;
import ucn.ArchivoEntrada;
import ucn.ArchivoSalida;
import ucn.Registro;
import ucn.StdIn;
import ucn.StdOut;

/**
 *
 * @author bonil
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       ArchivoEntrada arch1=new ArchivoEntrada("C:/Users/bonil/Desktop/Talleres/Taller1/JavaApplication8/src/Datos.txt");
        ArchivoSalida arch2=new ArchivoSalida("C:/Users/bonil/Desktop/Talleres/Taller1/JavaApplication8/src/Resultados.txt");
        while(!arch1.isEndFile()){//Mientras no sea fin de archivo
//Se obtiene el registro
        Registro regEnt = arch1.getRegistro();
//Se separa el registro en los campos que lo constituyen
        String nombre = regEnt.getString();
        String matricula = regEnt.getString();
        double n1 = regEnt.getDouble();
        double n2 = regEnt.getDouble();
        double n3 = regEnt.getDouble();
//Se calcula el promedio
        double promAl = (n1+n2+n3)/3;
        //Se crea un registro de salida con 3 campos
        Registro registroSalida = new Registro(3);
//Se agregan cada uno de los campos
//al registro de salida
        registroSalida.agregarCampo(nombre);
        registroSalida.agregarCampo(matricula);
        registroSalida.agregarCampo(promAl);

 //Se graba el registro de salida en arch2
        arch2.writeRegistro(registroSalida);
 } //Fin while
 //Se cierran los archivos
        arch1.close();
        arch2.close();
        


// TODO code application logic here
    }
    
}