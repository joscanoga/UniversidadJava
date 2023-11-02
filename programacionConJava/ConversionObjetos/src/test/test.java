package test;

import domain.*;

public class test {

    public static void main(String[] args) {
      Empleado empleado;
      empleado= new Escritor(TipoEscritura.CLASICO,"juan",1000);
      System.out.println("empleado = " + empleado);
      System.out.println("obtener detalles"+empleado.obtenerDetalles());
        
    }

    
    
}
