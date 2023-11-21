/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.jdbc.datos;

import java.sql.*;

/**
 *
 * @author johan
 */
public class Conexion {

    private static final String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&Timezone=UTC&allowPublicRetrival=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_password = "my_root_password";

    public static Connection getConnection() throws SQLException {
        return (DriverManager.getConnection(url, JDBC_USER, JDBC_password));
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
