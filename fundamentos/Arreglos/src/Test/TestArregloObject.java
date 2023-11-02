/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import domain.Persona;

/**
 *
 * @author johan
 */
public class TestArregloObject {
    public static void main(String[] args) {
        Persona personas [] =new Persona[5];
        personas[0]=new Persona("johan");
        personas[1]=new Persona("johan");
        personas[2]=new Persona("johan");
        personas[3]=new Persona("johan");
        personas[4]=new Persona("johan");
        for (int i=0;i<personas.length;i++){
            System.out.println("persona "+i+"= " + personas[i]);
        }
    }
    
}
