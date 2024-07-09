<%-- 
    Document   : index
    Created on : 15/06/2024, 4:27:26 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC 2 </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo MVC 2!</h1>
        <br/><br/>
        <div style="color: red;">${mensaje}</div>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador">
            link al servlet controlador sin parametros
        </a>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregarVariables">
            link al servlet controlador agregar variables
        </a>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
            link al servlet controlador con listar variables
        </a>
    </body>
</html>
