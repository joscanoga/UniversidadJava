/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author johan
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dias.LUNES = " + Dias.LUNES);
        System.out.println("cuarto continente"+Continentes.AMERICA);
        System.out.println("# paises cuarto continente "+Continentes.AMERICA.getPaises());
    }
    public static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES -> System.out.println("Primer dia");
            case MARTES -> System.out.println("Segundo dia");
            default -> System.out.println("mas de 3 dia");     
        }
        
    }
    
}
