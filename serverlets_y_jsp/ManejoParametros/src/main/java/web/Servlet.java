/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author johan
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //leer los parametros
        String usuario= request.getParameter("usuario");
        System.out.println("usuario = " + usuario);
        String password= request.getParameter("password");
        System.out.println("password = " + password);
        PrintWriter out=response.getWriter();
        out.print("autentificado");
        out.print("<br/>");
        out.print(usuario);
        out.print("<br/>");
        out.print(password);
        out.close();
    }
}
