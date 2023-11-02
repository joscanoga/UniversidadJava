/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import accesoDatos.*;

/**
 *
 * @author johan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IAccesoDatos datos= new ImplementacionMySQL();
        datos.listar();
        datos= new ImplementacionOracle();
        datos.listar();
    }
    
}
