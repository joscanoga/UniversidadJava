/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author johan
 */
public class TestForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] edades={5,6,7,8,9,10};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        Persona[] personas={new Persona("persona 1"),new Persona("persona 2"),new Persona("persona 3")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
    
}
