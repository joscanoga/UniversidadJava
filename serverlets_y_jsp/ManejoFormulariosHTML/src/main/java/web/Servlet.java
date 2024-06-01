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
@WebServlet("/home")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset-utf-8");
        PrintWriter out= response.getWriter();
        String usuario = request.getParameter("usuario");
        String password=request.getParameter("password");
        String tecnologias[]=request.getParameterValues("tecnologia");
        String genero=request.getParameter("genero");
        String ocupacion =request.getParameter("ocupacion");
        String musica= request.getParameter("musica");
        String comentarios=request.getParameter("comentarios");
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Ejercicio Formulario</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<b>usuario: </b> "+usuario);
        out.print("<br/>");
        out.print("<b>password: </b> "+password);
        out.print("<br/>");
        out.print("<b>tecnologias: </b> ");
        out.print("<br/>");
        for(String tecnologia : tecnologias){
            out.print(tecnologia);
            out.print("<br/>");
        }
        out.print("<b>genero: </b> "+genero);
        out.print("<br/>");
        out.print("<b>ocupacion: </b> "+ocupacion);
        out.print("<br/>");
        out.print("<b>musica: </b> "+musica);
        out.print("<br/>");
        out.print("<b>comentarios: </b> "+comentarios);
        out.print("<br/>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
