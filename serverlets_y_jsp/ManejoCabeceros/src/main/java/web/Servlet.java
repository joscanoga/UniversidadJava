/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html;chartset-UTF-8");
        PrintWriter out=response.getWriter();
        String metodoHttp=request.getMethod();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Manejo Cabeceros</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Cabeceros</h1>");
        out.print("<b>metodoHttp: </b>"+metodoHttp);
        out.print("<br/>");
        String uri=request.getRequestURI();
        out.print("<b>uri: </b>"+uri);
        out.print("<br/>");
        Enumeration cabeceros=request.getHeaderNames();
        while(cabeceros.hasMoreElements()){
            String nombreCabecero = (String)cabeceros.nextElement();
            out.print("<b>"+nombreCabecero+": </b>"+request.getHeader(nombreCabecero));
            out.print("<br/>");
            
        }
        out.print("<br/>");
        out.print("</body>");
        out.print("</html>");
        out.close();
        
    }
}
