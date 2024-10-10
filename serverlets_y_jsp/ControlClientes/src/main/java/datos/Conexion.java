/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author johan
 */
public class Conexion {
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/control_clientes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER="my_user";
    private static final String JDBC_PASSWORD="Bahia330cm3_2";
    
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        ds.setInitialSize(50);
        return ds;
    }
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
       
        }
    }
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
       
        }
    }
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
       
        }
    }
}
