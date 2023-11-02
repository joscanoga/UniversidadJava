/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.sql.*;




/**
 *
 * @author johan
 */
public class Test {
     public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&Timezone=UTC&allowPublicRetrival=true";
         try {
             //Class.forName("com.jc.jdbc.Driver");
             Connection conexion= DriverManager.getConnection(url,"root","my_root_password");
             Statement instruccion =conexion.createStatement();
             var sql="SELECT id_persona,nombre,apellido,email,telefono FROM persona";
             ResultSet resultado=instruccion.executeQuery(sql);
             while(resultado.next()){
                 System.out.print("id persona: "+resultado.getInt("id_persona"));
                 System.out.println(" nombre: "+resultado.getString("nombre"));
             }
             resultado.close();
             instruccion.close();
             conexion.close();
         } catch (SQLException ex) {
             ex.printStackTrace(System.out);
         }
         
    }
}
