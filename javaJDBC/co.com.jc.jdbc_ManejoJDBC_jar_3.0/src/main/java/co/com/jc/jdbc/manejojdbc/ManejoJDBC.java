/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.com.jc.jdbc.manejojdbc;

import co.com.jc.jdbc.datos.Conexion;
import co.com.jc.jdbc.datos.PersonaDAO;
import co.com.jc.jdbc.datos.PersonaDaoJDBC;
import co.com.jc.jdbc.datos.UsuarioDAO;
import co.com.jc.jdbc.domain.PersonaDTO;
import co.com.jc.jdbc.domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johan
 */
public class ManejoJDBC {

    public static void main(String[] args) {
        Connection conexion = null;    
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit() == true) {
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDao = new PersonaDaoJDBC(conexion);
            List<PersonaDTO> personas = personaDao.selecionar();
            for(PersonaDTO persona: personas){
                System.out.println("persona = " + persona);
            }
            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rolback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
