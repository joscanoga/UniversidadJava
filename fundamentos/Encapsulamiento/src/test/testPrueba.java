/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import dominio.*;
/**
 *
 * @author johan
 */
public class testPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("johan",1000,false);
        System.out.println("persona1 nombre= " + persona1.getNombre());
        System.out.println("persona1 sueldo= " + persona1.getSueldo());
        System.out.println("persona1 eliminado= " + persona1.isEliminado());
        System.out.println("persona1 = " + persona1);
    }
}
