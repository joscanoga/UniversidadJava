/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author johan
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    //los bloques de inicializacion se ejecutan antes que el constructor de la clase
    static{
        //se ejecuta solamente al cargar la clase en memoria
        System.out.println("ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    {
       //bloque de inicializacion no estatico, se ejecuta  al crear un nuevo objeto
        System.out.println("ejecucion bloque no estatico");
        this.idPersona=Persona.contadorPersonas++;
    }
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
