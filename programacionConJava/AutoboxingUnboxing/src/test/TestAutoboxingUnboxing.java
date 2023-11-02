
package test;

/**
 *
 * @author johan
 */
public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clase envolvente 
        /*
        int -Integer
        long -Long
        float-Float
        doble-Double
        bolean-Bolean
        byte-Byte
        char-character
        short- Short
        */
        Integer entero =10;//Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero.doubleValue() = " + entero.doubleValue());
        
        int entero2=entero;
        System.out.println("entero2 = " + entero2);
        
    }
}
