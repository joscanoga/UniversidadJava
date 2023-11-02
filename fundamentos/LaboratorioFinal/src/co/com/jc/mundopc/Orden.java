/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.mundopc;

/**
 *
 * @author johan
 */
public class Orden {
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrden;
    private int contadorComputadoras;
    private  static int maxComputadoras=10;

    public Orden() {
        this.idOrden=++Orden.contadorOrden;
        this.computadoras= new Computadora[Orden.maxComputadoras];
    }
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras<Orden.maxComputadoras){
            this.computadoras[this.contadorComputadoras++]=computadora;
        }else{
            System.out.println("Has superado el limite");
        }
    }

    public int getIdOrden() {
        return idOrden;
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }

    public static int getContadorOrden() {
        return contadorOrden;
    }

    public int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static int getMaxComputadoras() {
        return maxComputadoras;
    }

    public void setComputadoras(Computadora[] computadoras) {
        this.computadoras = computadoras;
    }

    public static void setContadorOrden(int contadorOrden) {
        Orden.contadorOrden = contadorOrden;
    }

    public static void setMaxComputadoras(int maxComputadoras) {
        Orden.maxComputadoras = maxComputadoras;
    }
    
    public void mostrarOrden(){
        System.out.println("Numero de orden: "+this.idOrden);
        System.out.println("Computadoras:");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
        
    }
    
}
