<%-- 
    Document   : RecursoPublicoJSP
    Created on : 6/04/2024, 11:27:40 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <br/>
        <h1>inclusion de contenido dinamico desde un jsp publico!</h1>
        <br/>
        Nombre de la aplicacion: <%= request.getContextPath() %>
    </body>
</html>
