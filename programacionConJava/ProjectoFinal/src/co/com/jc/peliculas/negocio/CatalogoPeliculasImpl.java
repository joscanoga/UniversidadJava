/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.peliculas.negocio;

import co.com.jc.peliculas.datos.AccesoDatos;
import co.com.jc.peliculas.datos.AccesoDatosImpl;
import co.com.jc.peliculas.domain.Pelicula;
import co.com.jc.peliculas.excepciones.AccesoDatosEx;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johan
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        try {
            Pelicula pelicula= new Pelicula(nombrePelicula);
            boolean anexar=datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            peliculas.forEach(pelicula->System.out.println("Pelicula = "+pelicula));
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso al archivo");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        try {
            String resultado=datos.Buscar(NOMBRE_RECURSO, buscar);
            System.out.println("resultado = " + resultado);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error buscando los datos");
            ex.printStackTrace(System.out);
        }
        
    }

    @Override
    public void iniciarCatalogo() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }else{
                datos.crear(NOMBRE_RECURSO);
            }
            System.out.println("Catalogo inicializado");
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciarl el catalogo");
            ex.printStackTrace(System.out);
        }
    }
    
   
    
}
