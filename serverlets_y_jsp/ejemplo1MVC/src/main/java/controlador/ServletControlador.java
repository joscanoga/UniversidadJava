
package controlador;

import jakarta.servlet.RequestDispatcher;
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
public class ServletControlador  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        //1.procesamos los parametros
        
        //2.Creamos los javabeans
        Rectangulo rec= new Rectangulo(3,6);
        
        //3.agregamos los javabeans a algunalcance
        request.setAttribute("mensaje", "Saludo desde el Servlet");
        HttpSession session = request.getSession();
        
        session.setAttribute("rectangulo", rec);
        
        //4.redireccionar a la vista seleccionada
        RequestDispatcher rd=request.getRequestDispatcher("vista/desplegarvariables.jsp");
        rd.forward(request, response);
    }
    
}
