/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.peliculas.datos;

import co.com.jc.peliculas.domain.Pelicula;
import co.com.jc.peliculas.excepciones.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return(archivo.exists());
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas= new ArrayList<>();
        try {
            BufferedReader entrada= new BufferedReader(new FileReader(archivo));
            String lectura=entrada.readLine();
            while(lectura!=null){
                peliculas.add(new Pelicula(lectura));
                
                lectura=entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx(ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx(ex.getMessage());
        }
        return(peliculas);
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha anexado texto a el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx(ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx(ex.getMessage());
        }
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("error al crear el archivo"+ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        if(archivo.exists()){
            archivo.delete();
            System.out.println("Se ha borrado el archivo");
        }
    }

    @Override
    public String Buscar(String nombreArchivo, String buscar)throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        String resultado=null;
        try {
            BufferedReader entrada= new BufferedReader(new FileReader(archivo));
            String lectura=entrada.readLine();
            int indice=1;
            while(lectura!=null){
                if(buscar != null&&buscar.equalsIgnoreCase(lectura)){
                    resultado="Pelicula: "+lectura+", indice: "+ indice;
                    break;
                }else{
                    lectura=entrada.readLine();
                    indice++;
                }
                
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx(ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx(ex.getMessage());
        }
        
        return(resultado);
    }

    
    
}
