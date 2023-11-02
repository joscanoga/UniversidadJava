/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Cliente;
import domain.Empleado;

/**
 *
 * @author johan
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado(1000,"johan",'M',27,"Envigado");
        System.out.println("empleado1 = " + empleado1);
        Cliente cliente1= new Cliente(true,"johan",'M',27,"Envigado");
        System.out.println("cliente1 = " + cliente1);
        
    }
}
