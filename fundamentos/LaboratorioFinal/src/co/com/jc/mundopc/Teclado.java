/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.mundopc;

/**
 *
 * @author johan
 */
public class Teclado extends DispositivoDeEntrada{
    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado=++Teclado.contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado +", marca: "+this.getMarca()+", tipo de entrada:"+this.getTipoEntrada()+ '}';
    }
    
    
    
}
