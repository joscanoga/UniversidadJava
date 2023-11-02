/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.mundopc;

/**
 *
 * @author johan
 */
public class Raton extends DispositivoDeEntrada {
    private final int idRaton;
    private static int contadorRaton;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton=++Raton.contadorRaton;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public static int getContadorRaton() {
        return contadorRaton;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton:" + this.idRaton +", marca: "+this.getMarca()+", tipo de entrada:"+this.getTipoEntrada()+ '}';
    }
    
}
