/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paquete1.Clase1;

/**
 *
 * @author johan
 */
public class Test {
    public static void main(String[] args) {
        //modificadores de acceso
        //privado solo se permite desde la misma clase
        //default solo se pérmite desde el mismo paquete
        //protected desde las clases hijas
        //public desde cualquoier parte
        Clase1 clase1= new Clase1();
        System.out.println("clase1 = " + clase1);
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
    }
}
