/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.ventas;

/**
 *
 * @author johan
 */
public class Orden {
   private final int idOrden;
   private Producto[] productos;
   private static int contadorOrden=0;
   private int contadorProductos;
   private static final  int MAX_PRODUCTOS=10;

    public Orden() {
        this.idOrden=++contadorOrden;
        this.productos= new Producto[Orden.MAX_PRODUCTOS];
        
    }
    public void agregarProducto(Producto producto){
        if(this.contadorProductos<Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++]=producto;
            
        }else{
            System.out.println("Se ha superado el numero maximo de productos");
        }
    }
    
    public double calcularTotal(){
        double resultado=0.0;
        for (int i = 0; i < this.contadorProductos; i++) {
            resultado += this.productos[i].getPrecio();
        }
        return(resultado);
    }
    public void mostarOrden(){
        System.out.println("Id orden = " + this.idOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("El total de la orden es: $"+this.calcularTotal());
    }

   
}
