/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.com.jc.jdbc.manejojdbc;

import co.com.jc.jdbc.datos.Conexion;
import co.com.jc.jdbc.datos.PersonaDAO;
import co.com.jc.jdbc.datos.UsuarioDAO;
import co.com.jc.jdbc.domain.Persona;
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
            PersonaDAO personaDao = new PersonaDAO(conexion);
            Persona  cambioPersona= new Persona();
            cambioPersona.setNombre("juan");
            cambioPersona.setIdPesrona(12);
            personaDao.actualizarPersona(cambioPersona);
            Persona nuevaPersona = new Persona("carlos","Ramirez","email","telefono");
            personaDao.insertar(nuevaPersona);
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
