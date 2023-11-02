/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasoPorReferencia;

import clases.Persona;

/**
 *
 * @author johan
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre="johan";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 nuevo nombre = " + persona1.nombre);
    }
    public static void cambiarValor(Persona persona){
        persona.nombre="sebastian";
    }
}
