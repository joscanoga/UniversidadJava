/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package accesoDatos;

/**
 *
 * @author johan
 */
public interface IAccesoDatos {
    //PUBLIC STATIC FINAL
    int MAX_REGISTROS=10;
    //Se le debe asignar un valor
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
}
