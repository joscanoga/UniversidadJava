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
@WebServlet("/ContadorVisitas")
public class ContadorVisitasServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
        //declaramos variable contador
        int contador=0;
        
        //revisamos si ya existe la cookie
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for(Cookie c : cookies){
                if(c.getName().equals("ContadorVisitas")){
                    contador=Integer.parseInt(c.getValue());
                    break;
                }
                    
            }
        }
        //incrementamos contador
        contador++;
        Cookie c= new Cookie("ContadorVisitas",Integer.toString(contador));
        //definimos la expiracion de este
        c.setMaxAge(3600);
        response.addCookie(c);
        //enviamos el mensaje
        response.setContentType("text/Html;charset=utf-8");
        try {
            PrintWriter out = response.getWriter();
            out.println("contador de visitas de cliente: "+contador);
            
        } catch (IOException ex) {
            Logger.getLogger(ContadorVisitasServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
