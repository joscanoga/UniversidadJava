/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

/**
 *
 * @author johan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            System.out.println(Aritmetica.division(10,0));
        }catch(OperacionExcepcion e){
            System.out.println("se activo la excepcion OperacionExcepcion");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division");
        }
    }
    
}
