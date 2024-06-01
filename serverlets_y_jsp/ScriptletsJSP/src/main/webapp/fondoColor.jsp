<%-- 
    Document   : fondoColor
    Created on : 31/03/2024, 11:04:34 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String fondo= request.getParameter("colorFondo");
    if(fondo==null||fondo.trim().equals("")){
    fondo="white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP color</title>
    </head>
    <body bgcolor="<%=fondo %>">
        <h1>Cambio Color!</h1>
        <br/>
        Color aplicado: <%=fondo %>
        <br/>
        <a href="index.html">Regresar al inicio</a>

    </body>
</html>
