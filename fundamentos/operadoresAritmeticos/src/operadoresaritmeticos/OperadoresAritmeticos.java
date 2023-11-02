/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author johan
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5, b = 7;
        var resultado = a + b;
        System.out.println("resultado suma= " + resultado);
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        resultado = a / b;
        System.out.println("resultado division= " + resultado);
        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);
        int c = a + 5 - b;
        System.out.println("c = " + c);
        //incremento de una unidad
        a += 1;//a=a+1
        System.out.println("a = " + a);
        a += 5;
        System.out.println("a = " + a);
        a -= 2;
        System.out.println("a = " + a);
        a *= 2;
        System.out.println("a = " + a);
        a /= 4;
        System.out.println("a = " + a);
        a %= 2;
        System.out.println("a = " + a);
        //operadores unarios
        var menosA = -a;
        System.out.println("menosA = " + menosA);
        var d1 = true;
        System.out.println("d1 = " + d1);
        var d2 = !d1;
        System.out.println("d2 = " + d2);
        var e = 1;
        System.out.println("e = " + e);
        //preincremento
        var f = ++e;
        System.out.println("f = " + f);
        System.out.println("e = " + e);
        //post incremento
        var h = 5;
        System.out.println("h = " + h);
        var g = h++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //operadores de igualdad y relacionales
        var R1 = a == b;
        System.out.println("R1 = " + R1);
        var r2 = a != b;
        System.out.println("r2 = " + r2);
        String cadena1 = "hola";
        String cadena2 = "hola";
        var r3 = cadena1 == cadena2;
        System.out.println("r3 = " + r3);
        var r4 = cadena1.equals(cadena2);
        System.out.println("r4 = " + r4);

        //operadores condicionales
        a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var result = a >= valorMinimo && a <= valorMaximo;
        System.out.println("result = " + result);
        if (result) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }

        var vacaciones = false;
        var diaDescanso = true;
        if (vacaciones || diaDescanso) {
            System.out.println("Puede asistir");
        } else {
            System.out.println("Esta ocupado");
        }
        
        // operador ternario
        var variable =(3>2)? "verdadero":"falso";
        System.out.println("variable = " + variable);

    }

}
