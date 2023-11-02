/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.peliculas.excepciones;

/**
 *
 * @author johan
 */
public class LecturaDatosEx extends AccesoDatosEx {
    
    public LecturaDatosEx() {
        super("Error al leer los datos");
    }
    public LecturaDatosEx(String message) {
        super("Error al leer los datos, "+message);
    }
    
}
