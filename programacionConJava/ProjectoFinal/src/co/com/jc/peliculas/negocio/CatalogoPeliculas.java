/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.jc.peliculas.negocio;

/**
 *
 * @author johan
 */
public interface CatalogoPeliculas {
    String NOMBRE_RECURSO="peliculas.txt";
    public void agregarPelicula(String nombrePelicula);
    public void listarPeliculas();
    public void buscarPelicula(String buscar);
    public void iniciarCatalogo();
}
