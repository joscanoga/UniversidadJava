/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johan
 */
@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        //obtenemos la sesion
        HttpSession session = request.getSession();
        
        String titulo;
        
        //pedir el contador visitas a la sesion
        Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");
        // si es nulo significa que el la primera vez que visita
        if(contadorVisitas==null){
            contadorVisitas=1;
            titulo="Bienvenido po primera vez!";
        }else{
            contadorVisitas++;
            
            titulo="Bienvenido nuevamente ";
        }
        session.setAttribute("contadorVisitas", contadorVisitas);
        PrintWriter out;
        try {
            out = response.getWriter();
            out.println("<h1>"+titulo+"</h1>");
            out.println("<br/>");
            out.println("<h2>contador: "+contadorVisitas+"</h2>");
            out.println("<br/>");
            out.println("<h2>Session: "+session.getId()+"</h2>");
            
        } catch (IOException ex) {
            Logger.getLogger(SesionesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
