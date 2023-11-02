/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;

/**
 *
 * @author johan
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //while
        System.out.println("While\n");
        int contador=0;
        while(contador<5){
            System.out.println("contador while = " + contador);
            contador++;
        }
        contador=0;
        //dowhile
        System.out.println("\n do while\n");
        do{
            System.out.println("contador do while = " + contador);
            contador++;
        }while(contador<5);
        System.out.println("\n for\n");
        //ciclo for
        for (int i = 0; i < 10; i++) {
            System.out.println("Contador for= " + i);
        }
        //continue
        System.out.println("\n for con continue\n");
        //continue salta directamente a la otra iteracion
        for (int i = 0; i < 10; i++) {
            if(i%2 != 0){
                continue;
            }
            System.out.println("Contador for= " + i);
        }
        //break
        //break rompe el ciclo y continua con el codigo
        System.out.println("While con break\n");
        contador=0;
        while(true){
            System.out.println("contador while = " + contador);
            if(contador==10){
                break;
            }
            contador++;
        }
    }
    
}
