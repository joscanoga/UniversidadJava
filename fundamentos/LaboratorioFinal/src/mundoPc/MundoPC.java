/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mundoPc;

import co.com.jc.mundopc.*;

/**
 *
 * @author johan
 */
public class MundoPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teclado teclado1= new Teclado("usb","Sony");
        Raton raton1= new Raton("usb","Sony");
        Monitor monitor1= new Monitor("samsung",24);
        Teclado teclado2= new Teclado("usb","LG");
        Raton raton2= new Raton("usb","LG");
        Monitor monitor2= new Monitor("asus",24);
        Computadora computadora1= new Computadora("pc1",monitor1,teclado1,raton1);
        Computadora computadora2= new Computadora("pc2",monitor2,teclado2,raton2);
        Computadora computadora3= new Computadora("pc3",monitor1,teclado2,raton2);
        Computadora computadora4= new Computadora("pc4",monitor1,teclado1,raton2);
        
        Orden orden =new Orden();
        orden.mostrarOrden();
        orden.agregarComputadora(computadora1);
        orden.agregarComputadora(computadora2);
        orden.agregarComputadora(computadora3);
        orden.agregarComputadora(computadora4);
        orden.mostrarOrden();
    }
    
}
