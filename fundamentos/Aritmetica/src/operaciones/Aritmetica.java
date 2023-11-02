/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

/**
 *
 * @author johan
 */
public class Aritmetica {

   
    public Aritmetica(){
        
    }
    public Aritmetica(int a,int b){
        this.a=a;
        this.b=b;         
    }
    int a;
    int b;
    public void sumar(){
        System.out.println("El resultado es: "+(a+b));
    }
    public int sumarConRetorno(){
        return(a+b);
    }
    public int sumarConArgumentos(int a,int b){
        return(a+b);
    }
            
    
}
