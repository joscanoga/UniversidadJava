
package paquete1;

/**
 *
 * @author johan
 */
public class Clase1 {
    public String atributoPublico="publico";
    protected String atributoProtected="atributo protected";
    public Clase1(){
        System.out.println("constructor publico");
    }
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    public void metodoprotected(){
        System.out.println("Metodo protected");
    }
}
