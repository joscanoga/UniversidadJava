/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.com.jc.jdbc.manejojdbc;

import co.com.jc.jdbc.datos.PersonaDAO;
import co.com.jc.jdbc.datos.UsuarioDAO;
import co.com.jc.jdbc.domain.Persona;
import co.com.jc.jdbc.domain.Usuario;
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
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        
        List<Usuario> usuarios= usuarioDAO.selecionar();
        for(Usuario usuario: usuarios){
            System.out.println("persona = " + usuario);
        }
        
        //insertando
        Usuario usuarioNuevo=new Usuario("Camila","pedorra");
        registros=usuarioDAO.insertar(usuarioNuevo);
        System.out.println("registros = " + registros);
        //actualizar
        Usuario usuarioAct=usuarios.get(0);
        usuarioAct.setPassword("gmail.com");
        registros=personaDao.actualizarPersona(personaAct);
        System.out.println("registros = " + registros);
        
        //Eliminar
        Usuario usuarioDel=usuarios.get(1);
        
        registros=usuarioDAO.Eliminar(usuarioDel);
        System.out.println("registros = " + registros);
        
        
        
    }
}
