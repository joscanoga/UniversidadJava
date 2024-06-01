package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

    

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Simulando los valores correctos
        String usuarioOk = "joscanoga";
        String passwordOk = "12345";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos:");
            out.print("<br>");
            out.print("Usuario:" + usuario);
            out.print("<br>");
            out.print("Password:" + password);
            out.print("<br>");
            out.print("</h1>");
        }
        else{
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
    
}


