/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.peliculas.domain;

/**
 *
 * @author johan
 */
public class Pelicula {
    
    private String nombre;
    
    
    public Pelicula() {
        
        
    }

    public Pelicula(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + '}';
    }
    
    
}
