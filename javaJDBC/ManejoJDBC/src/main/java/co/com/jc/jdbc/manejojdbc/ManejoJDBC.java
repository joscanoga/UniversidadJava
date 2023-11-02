/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.com.jc.jdbc.manejojdbc;

import co.com.jc.jdbc.datos.PersonaDAO;
import co.com.jc.jdbc.domain.Persona;
import java.util.List;



/**
 *
 * @author johan
 */
public class ManejoJDBC {

    public static void main(String[] args) {
        
        
        PersonaDAO personaDao = new PersonaDAO();
        
        
        List<Persona> personas= personaDao.selecionar();
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
        
        //insertando
        Persona personaNueva=new Persona("Camila","pinche pedorra","email","telefono");
        int registros=personaDao.insertar(personaNueva);
        System.out.println("registros = " + registros);
        //actualizar
        Persona personaAct=personas.get(0);
        personaAct.setEmail("gmail.com");
        registros=personaDao.actualizarPersona(personaAct);
        System.out.println("registros = " + registros);
        
        //Eliminar
        Persona personaDel=personas.get(1);
        
        registros=personaDao.Eliminar(personaDel);
        System.out.println("registros = " + registros);
        
        
        
    }
}
