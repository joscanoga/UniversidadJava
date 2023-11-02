package test;

import domain.*;

public class test {

    public static void main(String[] args) {
      Empleado empleado1;
      empleado1= new Empleado("juan",1000);
      System.out.println("empleado = " + empleado1);
      System.out.println("obtener detalles"+empleado1.obtenerDetalles());
      Empleado empleado2;
      empleado2= new Empleado("juan",1000);
      System.out.println("empleado = " + empleado1);
      System.out.println("obtener detalles"+empleado1.obtenerDetalles());
      if (empleado1==empleado2){
          System.out.println("misma referencia");
      }else{
          System.out.println("diferente referencia");
      }
      if(empleado1.equals(empleado2)){
          System.out.println("son iguales en contenido");
      }
      else{
          System.out.println("sondiferentes en contenido");
      }
      if (empleado1.hashCode()==empleado2.hashCode()){
          System.out.println("mismo hascode");
      }else{
          System.out.println("diferente hascode");
      }
     
    }

    
    
}
