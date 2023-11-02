/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;

/**
 *
 * @author johan
 */
public class ImplementacionMySQL implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("INSERTAR DESDE MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("LISTAR DESDE MYSQL"); 
    }

    @Override
    public void actualizar() {
        System.out.println("ACTUALIZAR DESDE MYSQL");
    }

    @Override
    public void eliminar() {
        System.out.println("ELIMINAR DESDE MYSQL"); 
    }
    
}
