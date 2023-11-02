/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.*;


/**
 *
 * @author johan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        System.out.println("lista: ");
        imprimir(miLista);
        Set miSet =new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        System.out.println("set: ");
        imprimir(miSet);
        Map miMap= new HashMap();
        miMap.put(1,"Lunes");
        miMap.put(2,"Martes");
        miMap.put(3,"Miercoles");
        miMap.put(4,"Jueves");
        miMap.put(5,"Viernes");
        System.out.println("mi mapa");
        imprimir(miMap.keySet());
        //con genericos
        System.out.println("con genericos:");
        List<String> miLista1 = new ArrayList<>();
        miLista1.add("Lunes");
        miLista1.add("Martes");
        miLista1.add("Miercoles");
        miLista1.add("Jueves");
        miLista1.add("Viernes");
        System.out.println("lista: ");
        imprimir(miLista1);
        Set<String> miSet1 =new HashSet<>();
        miSet1.add("Lunes");
        miSet1.add("Martes");
        miSet1.add("Miercoles");
        miSet1.add("Jueves");
        miSet1.add("Viernes");
        System.out.println("set: ");
        imprimir(miSet1);
        Map<Integer,String> miMap1= new HashMap<>();
        miMap1.put(1,"Lunes");
        miMap1.put(2,"Martes");
        miMap1.put(3,"Miercoles");
        miMap1.put(4,"Jueves");
        miMap1.put(5,"Viernes");
        System.out.println("mi mapa1");
        imprimir(miMap1.keySet());
        
    }
    public static void imprimir(Collection colection){
        for(Object elemento: colection){
            System.out.println("llave = " + elemento);
        }
    }
    
}
