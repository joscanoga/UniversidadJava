/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johan
 */
@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");

        //creamos o recuperamos la sesion
        HttpSession session = request.getSession();

        //recuperamos la lista de articulos  previos si existe
        List<String> articulos = (List<String>) session.getAttribute("articulos");

        //verificcamos si la lista existe
        if (articulos == null) {
            articulos = new ArrayList<>();
            session.setAttribute("articulos", articulos);
        }

        //procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        //mostramos la lista de articulos
        PrintWriter out;
        try {
            out = response.getWriter();
            out.println("<h1> Carrito de Compras</h1>");
            out.println("<ul>");
            for (String art : articulos) {
                out.println("<li>" + art + "</li>");
            }
            out.println("<ul>");
            out.println("<a href='/CarritoCompras'>Regrtesar al inicio</a>");
        } catch (IOException ex) {
            Logger.getLogger(CarritoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
