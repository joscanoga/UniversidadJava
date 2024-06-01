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

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
        //suponemos que es un nuevo usuario
        boolean nuevoUsuario= true;
        Cookie[] cookies= request.getCookies();
        
        //buscamos alguna cookie que exista
        if(cookies!=null){
            for(Cookie c: cookies){
                if(c.getName().equals("visitanteRecurrente")&&c.getValue().equals("si")){
                    //si esta marcado como usuario recurente
                    nuevoUsuario=false;
                    break;
                }
            }
        }
        String mensaje ;
        if(nuevoUsuario){
            Cookie visitanteRecurrente = new Cookie("visitanteRecurrente","si");
            response.addCookie(visitanteRecurrente);
            mensaje="Gracias por visitar nuestro sitio por primera vez";
            
        }else{
            mensaje="Gracias por visitar nuevamente nuestro sitio ";
        }
        response.setContentType("text/html;chartset=utf-8");
        try {
            PrintWriter out =response.getWriter();
            out.println("<H1>"+mensaje+"</H1>");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(CookiesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
