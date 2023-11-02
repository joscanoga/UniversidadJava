/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.mundopc;

/**
 *
 * @author johan
 */
public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitor;

    private Monitor() {
        this.idMonitor=++Monitor.contadorMonitor;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static void setContadorMonitor(int contadorMonitor) {
        Monitor.contadorMonitor = contadorMonitor;
    }
    
    
}
