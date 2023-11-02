/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //esto es un comentario
        //Definimos la varible
        int miVariableEntera = 7;
        System.out.println(miVariableEntera);
        //modificamos la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        System.out.println("sout + tab es un atajo para el print en netbens");
        String miVariableCadena = "saludos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        //inferencia de tipos con var
        var miVaribleEntera2 = 9;
        System.out.println(miVaribleEntera2);
        var miVariableCadena2 = "java jdk 15";
        System.out.println(miVariableCadena2);
        //concatenacion de variables
        var usuario = "Johan";
        var titulo = "ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var numero1 = 2023;
        var numero2 = 1996;
        System.out.println(numero1 + numero2);//suma de numeros
        System.out.println(numero1 + numero2 + union);
        System.out.println(union + numero1 + numero2);
        System.out.println(union + (numero1 + numero2));
        //Caracteres especiales
        var nombre = "Karla";
        System.out.println("normal: " + nombre );
        System.out.println("nueva linea: \n" + nombre);
        System.out.println("tabulador : \t " + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("comilla simple \'"+nombre+"\'");
        System.out.println("comilla doble: \""+nombre+"\"");
        // clase scaner
        System.out.println("Escribe tu nombre:");
        Scanner consola=new Scanner(System.in);
        usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Ingrese su titulo");
        titulo= consola.nextLine();
        System.out.println("titulo = " + titulo);
        System.out.println("Resultado: "+titulo+" "+usuario);
        
    }

}
