/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.jc.peliculas.datos;

import co.com.jc.peliculas.domain.Pelicula;
import co.com.jc.peliculas.excepciones.AccesoDatosEx;
import java.util.List;

/**
 *
 * @author johan
 */
public interface AccesoDatos {
    public boolean existe(String nombreArchivo)throws AccesoDatosEx;
    public List<Pelicula> listar(String nombre)throws AccesoDatosEx;
    public String Buscar(String nombreArchivo, String buscar )throws AccesoDatosEx;
    public  void escribir(Pelicula pelicula,String nombreArchivo,boolean anexar)throws AccesoDatosEx;
    public void crear(String nombreArchivo)throws AccesoDatosEx;
    public void borrar(String nombreArchivo)throws AccesoDatosEx;
}
