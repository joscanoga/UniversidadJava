/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;

/**
 *
 * @author johan
 */
public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.vip = vip;
        this.fechaRegistro= new Date();
        Cliente.contadorCliente++;
        this.idCliente=Cliente.contadorCliente;
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public char getGenero() {
        return genero;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }


    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(',');
        sb.append(super.toString());
        sb.append('}');
        
        return sb.toString();
    }
    
    
}
