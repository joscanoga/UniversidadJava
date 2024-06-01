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
@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
            
        
            response.setContentType("application/vnd.ms-excel");//declaramos el tipo de contenido
            response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");//configuramos para descarga al ingresar a la url
            //poi.apache.org mas usos con excel
            //configurar la no generacion de cache
            response.setHeader("Pragma","no-cache");
            response.setHeader("cache-control","no-store" );
            response.setDateHeader("Expires", -1);//expire automaticamente la informacion
            try ( 
                //desplegamos la informacion
                PrintWriter out = response.getWriter()) {
                out.println("\tValores");
                out.println("\t1");
                out.println("\t2");
                out.println("Total\t=suma(B2:B3)");
            }
         catch (IOException ex) {
            Logger.getLogger(GeneracionExcelServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
}
