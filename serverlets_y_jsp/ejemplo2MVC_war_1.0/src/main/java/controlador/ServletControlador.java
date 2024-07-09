package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import modelo.Rectangulo;

/**
 *
 * @author johan
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.procesamos los parametros
        String accion = request.getParameter("accion");

        //2.Creamos los javabeans
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSession = new Rectangulo(3, 4);
        Rectangulo recAplicacion = new Rectangulo(5, 6);

        //3.agregamos los javabeans a algunalcance
        //revisamos la informacion proporcionada
        if ("agregarVariables".equals(accion)) {
            //alcance request
            request.setAttribute("recRequest", recRequest);

            //alcanse session
            HttpSession session = request.getSession();
            session.setAttribute("recSession", recSession);

            //alcance aplicacion
            ServletContext aplication = this.getServletContext();
            aplication.setAttribute("recAplicacion", recAplicacion);

            //mensaje
            request.setAttribute("mensaje", "las variables fueron agregadas");
            //4.redireccionar a la vista seleccionada
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        } else if ("listarVariables".equals(accion)) {
            //4.redireccionar a la vista seleccionada
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp");
            rd.forward(request, response);
        } else {
            //4.redireccionar a la vista seleccionada
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            
            //no propaga response ni request
            //response.sendRedirect("index.jsp");
        }
    }

}
