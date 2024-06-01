<%-- 
    Document   : recursoPrivado
    Created on : 6/04/2024, 11:31:09 p. m.
    Author     : johan
--%>
<%
    String colorFondo= request.getParameter("colorFondo");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body bgcolor="<%=colorFondo %>">
        <h1>Recurso privado!</h1>
    </body>
</html>
