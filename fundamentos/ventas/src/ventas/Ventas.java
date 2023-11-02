/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;

import co.com.jc.ventas.Orden;
import co.com.jc.ventas.Producto;

/**
 *
 * @author johan
 */
public class Ventas {
    public static void main(String[] args) {
        Producto producto1= new Producto("producto 1",10);
        Producto producto2= new Producto("producto 2",20);
        Producto producto3= new Producto("producto 3",30);
        Producto producto4= new Producto("producto 4",40);
        Producto producto5= new Producto("producto 5",50);
        
        Orden orden1=new Orden();
        orden1.mostarOrden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.mostarOrden();
    }
}
