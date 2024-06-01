/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        response.setHeader("refresh", "1");
        Date fecha = new Date();
        SimpleDateFormat formateador= new SimpleDateFormat("'Hora actualizada: ' HH:mm:ss");
        String horaConFormato = formateador.format(fecha);
        PrintWriter out;
        try {
            out = response.getWriter();
            out.print(horaConFormato);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(HoraServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
