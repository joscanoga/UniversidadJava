/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author johan
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[]=new int[5];
        System.out.println("edades = " + edades);
        
        edades[0]=10;
        System.out.println("edad  = " + edades[0]);
        
        for (int i=0;i<edades.length;i++){
            System.out.println("edades "+i+"= " + edades[i]);
        }
        
        String frutas[]={"platano","naranja"};
    }
}
