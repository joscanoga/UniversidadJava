/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        tipos primitivos enteros: byte,short,int,long
         */
        byte numeroByte = 1;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maxiomo del Byte: " + Byte.MAX_VALUE);

        short numeroShort = 150;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maxiomo del Short: " + Short.MAX_VALUE);

        int numeroInt = 50000;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maxiomo del Int: " + Integer.MAX_VALUE);

        //en el caso lo long se agrega una  L al final del numero
         long numeroLong = 2147483649L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo del Long: " + Long.MIN_VALUE);
        System.out.println("Valor maxiomo del Long: " + Long.MAX_VALUE);

        /*
        tipos primitivos flotantes float y double
        Se debe especificar con F o D alfinal de nuemero o hacer la conversion con parentesis 
         */
        float numeroFloat = 10.6789F;
        System.out.println("numeroFloat = " + numeroFloat);
        float numeroFloat2 = (float) 10.6789;
        System.out.println("numeroFloat2 = " + numeroFloat2);
        System.out.println("Valor minimo del float: " + Float.MIN_VALUE);
        System.out.println("Valor maxiomo del float: " + Float.MAX_VALUE);
        //no es obligatiorio especificar la D de double ya que por defecto cuando tiene el punto flotante es double 
        double numeroDouble = 3.4028235E39D;
        System.out.println("numeroDuoble = " + numeroDouble);
        System.out.println("Valor minimo del Double: " + Double.MIN_VALUE);
        System.out.println("Valor maxiomo del Double: " + Double.MAX_VALUE);
        
        //primitivo tipo char
        
        char miCaracter= 'z';
        System.out.println("miCaracter = " + miCaracter);
        char varChar='\u0021';
        System.out.println("varChar = " + varChar);
        char varCharDecimal=33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        char varCharsimbolo='!';
        System.out.println("varCharsimbolo = " + varCharsimbolo);
        //primitivo tipo boolean
        boolean varBolean=true;
        System.out.println("varBolean = " + varBolean);
        varBolean=false;
        System.out.println("varBolean = " + varBolean);
        //convertir string a integer
        var edad = Integer.parseInt("50");
        System.out.println("edad = " + edad+1);
        Scanner consola= new Scanner(System.in);
        edad=Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        char caracter ="Hola".charAt(0);
        System.out.println("caracter = " + caracter);

    }

}
