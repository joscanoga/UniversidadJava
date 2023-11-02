/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.jdbc.datos;

import co.com.jc.jdbc.domain.Persona;
import java.sql.*;
import java.util.*;


/**
 *
 * @author johan
 */
public class PersonaDAO {
    private static final String SQL_SELECT="SELECT id_persona,nombre,apellido,email,telefono FROM persona";
    private static final String SQL_INSERT="INSERT INTO persona(nombre,apellido,email,telefono) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE persona SET nombre=?,apellido=?,email=?,telefono=? WHERE id_persona=?";
    private static final String SQL_DELETE="DELETE FROM persona  WHERE id_persona=?";
    public List<Persona> selecionar(){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null; 
        Persona persona=null;
        List<Persona> personas = new ArrayList<>();
        try {
            conn= Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            while(rs.next()){
                int idPersona=rs.getInt("id_persona");
                String nombre=rs.getString("nombre");
                String apellido =rs.getString("apellido");
                String email= rs.getString("email");
                String telefono=rs.getString("telefono");
                persona=new Persona(idPersona,nombre,apellido,email,telefono);
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        
        }
        return (personas);
    }
    public int insertar(Persona persona){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        int registros=0;
        try {
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros=stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        
        }
        return(registros);
    }
    public int actualizarPersona(Persona persona){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        int registros=0;
        try {
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPesrona());
            
            registros=stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        
        }
        return(registros);
    }
        
    public int Eliminar(Persona persona){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        int registros=0;
        try {
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPesrona());
            registros=stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        
        }
        return(registros);
    }
}
