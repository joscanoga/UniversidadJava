<%-- 
    Document   : Expresiones
    Created on : 31/03/2024, 10:22:18 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Con expresiones</title>
    </head>
    <body>
        <h1>JSP Con expresiones</h1>
        Concatenacion: <%= "Saludos"+" "+"JSP" %>
        <BR/> 
        Operacion Matematica <%= 2+3/8 %>
        <br/>
        Session ID <%= session.getId() %>
        <br/>
        <a href="index.html">Link al inicio</a>
    </body>
</html>
