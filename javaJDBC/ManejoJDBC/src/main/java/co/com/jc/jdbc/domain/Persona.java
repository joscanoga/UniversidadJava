/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.jdbc.domain;

/**
 *
 * @author johan
 */
public class Persona {
    private int idPesrona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    public Persona(){
        
    }
    
    public Persona(int idPersona){
        this.idPesrona=idPersona;
    }

    public Persona(String nombre, String apellindo, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellindo;
        this.email = email;
        this.telefono = telefono;
    }

    public Persona(int idPesrona, String nombre, String apellindo, String email, String telefono) {
        this.idPesrona = idPesrona;
        this.nombre = nombre;
        this.apellido = apellindo;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdPesrona() {
        return idPesrona;
    }

    public void setIdPesrona(int idPesrona) {
        this.idPesrona = idPesrona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPesrona=" + idPesrona + ", nombre=" + nombre + ", apellindo=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}
