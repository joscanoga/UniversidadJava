/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package argumentosvariables;

/**
 *
 * @author johan
 */
public class ArgumentosVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4,5,6,7);
    }
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros["+i+"] = " + numeros[i]);
        }
    }
    
}
