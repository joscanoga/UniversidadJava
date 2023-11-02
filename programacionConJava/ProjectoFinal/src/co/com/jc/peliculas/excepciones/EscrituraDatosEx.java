/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.peliculas.excepciones;

/**
 *
 * @author johan
 */
public class EscrituraDatosEx extends AccesoDatosEx {
    
    public EscrituraDatosEx() {
        super("Error al escribir los datos");
    }
    public EscrituraDatosEx(String message) {
        super("Error al escribir los datos, "+message);
    }
}
