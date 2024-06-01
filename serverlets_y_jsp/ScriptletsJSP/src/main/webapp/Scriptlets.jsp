<%-- 
    Document   : Scriptlets
    Created on : 31/03/2024, 11:05:19 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets!</h1>
        <br/>
        <%--comentario  enviar informacion al navegador--%>
        <%
            out.print("saludos desde un Scriptlets");
        %>
        <%--Manipular objetos implicitos--%>
        <% 
        String nombreAplicacion = request.getContextPath();
        out.print("nombre de la aplicacion"+nombreAplicacion);
        %>
        <br/>
        <%
        if(session!=null && session.isNew()){
        %>
        La Sesion es Nueva
        <% 
            }else if(session!=null){
        %>
        la sesion es vieja
        <% 
            }else{
        %>
        La session No existe
        <% }%>
        <br/>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
