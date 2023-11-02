/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoFinal;

import co.com.jc.peliculas.negocio.CatalogoPeliculas;
import co.com.jc.peliculas.negocio.CatalogoPeliculasImpl;
import java.util.*;

/**
 *
 * @author johan
 */
public class ProjectoFinal {

    public static Scanner scanner = new Scanner(System.in);
    public static int opcion;
    public static String nombreArchivo;
    public static CatalogoPeliculas catalogoPeliculas= new CatalogoPeliculasImpl();

    public static void main(String[] args) {
        System.out.println("Elige una opcion:");
        System.out.println("1-Iniciar Catalogo");
        System.out.println("2-Agregar Pelicula");
        System.out.println("3-Listar Peliculas");
        System.out.println("4-Buscar Pelicula");
        System.out.println("0- salir");
        opcion = scanner.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1 :
                    catalogoPeliculas.iniciarCatalogo();
                    
                case 2 : 
                    System.out.println("Ingrese el nombre de la pelicula:");
                    String pelicula= scanner.nextLine();
                    catalogoPeliculas.agregarPelicula(pelicula);
                    break;
                case 3 :
                    catalogoPeliculas.listarPeliculas();
                    break;
                case 4 :
                    System.out.println("Ingrese el nombre de la pelicula:");
                    String buscar= scanner.nextLine();
                    catalogoPeliculas.buscarPelicula(buscar);
                    break;
                case 0 :
                    System.out.println("Adios" );
                    break;
                default :
                    System.out.println("Opcion invalida");
                    break;

            }
            System.out.println("Elige una opcion:");
            System.out.println("1-Iniciar Catalogo");
            System.out.println("2-Agregar Pelicula");
            System.out.println("3-Listar Peliculas");
            System.out.println("4-Buscar Pelicula");
            System.out.println("0- salir");
            opcion = scanner.nextInt();
        }
    }
}
