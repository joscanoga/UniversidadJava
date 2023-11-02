/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author johan
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear objetos
        Persona persona1 =new Persona();
        Persona persona2 =new Persona();
        //modificar atributos de una clase
        persona1.apellido="Cano";
        persona1.nombre="Johan";
        persona2.apellido="Rua";
        persona2.nombre="Camila";
        //utilizar metodo de una clase
        persona1.desplegarInformacion();
        persona2.desplegarInformacion();
        
        //imprimir un objeto sin metodo tostring
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
    }
    
}
