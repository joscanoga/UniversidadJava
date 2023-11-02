/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author johan
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 =new Aritmetica();
        aritmetica1.a=5;
        aritmetica1.b=7;
        aritmetica1.sumar();
        System.out.println("aritmetica1.sumarConRetorno() = " + aritmetica1.sumarConRetorno());
        System.out.println("sumar con argumentos: "+aritmetica1.sumarConArgumentos(5, 4));
        
        Aritmetica aritmetica2= new Aritmetica(4,6);
        System.out.println("aritmetica2 sumar con retorno = " + aritmetica2.sumarConRetorno());
        //lamar al garbage collector
        System.gc();
    }
}
