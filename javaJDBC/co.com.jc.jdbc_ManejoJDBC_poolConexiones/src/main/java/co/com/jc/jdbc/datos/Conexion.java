/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.jc.jdbc.datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author johan
 */
public class Conexion {

    private static final String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&Timezone=UTC&allowPublicRetrival=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_password = "my_root_password";
    
    public static DataSource getDataSource(){
        BasicDataSource DS= new BasicDataSource();
        DS.setUrl(url);
        DS.setUsername(JDBC_USER);
        DS.setPassword(JDBC_password);
        DS.setInitialSize(5);
        return(DS);
    };
    public static Connection getConnection() throws SQLException {
        return (getDataSource().getConnection());
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
