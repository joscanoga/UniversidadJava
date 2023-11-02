/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sentenciasdecontrol;

/**
 *
 * @author johan
 */
public class SentenciasDeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //if else
        boolean condicion1 = true;
        boolean condicion2 = false;
        if (condicion1) {
            System.out.println("condicion = " + condicion1);
        } else if (condicion2) {
            System.out.println("condicion = " + condicion2);
        } else {
            System.out.println("no se cumplieron las condiciones");
        }

        //switch
        var numero = 1;
        var texto = "desconocido";
        switch (numero) {
            case 1:
                texto = "uno";
                System.out.println("texto = " + texto);
                break;

            case 2:
                texto = "uno";
                System.out.println("texto = " + texto);
                break;

            default:
                System.out.println("texto = " + texto);
        }

    }

}
