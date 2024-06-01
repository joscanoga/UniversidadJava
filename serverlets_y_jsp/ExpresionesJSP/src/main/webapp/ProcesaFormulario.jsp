<%-- 
    Document   : ProcesaFormulario
    Created on : 31/03/2024, 10:25:34 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Procesa Formulario</title>
    </head>
    <body>
        <h1>Resultado!</h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br/>
        Password: <%= request.getParameter("password") %>
        <br/>
        <br/>
        <a href="index.html">Link al inicio</a>
    </body>
</html>
