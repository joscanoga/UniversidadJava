/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import static manejoArchivos.ManejoArchivos.*;
/**
 *
 * @author johan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="nombre.txt";
        //crearArchivo(nombre);
        //escribirArchivo(nombre,"Hola mundo archivos");
        anexarTextoArchivo(nombre, "adios");
        leerArchivo(nombre);
    }
    
}
