<%-- 
    Document   : desplegarvariables
    Created on : 15/06/2024, 4:16:33 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue da variables</title>
    </head>
    <body>
        <h1>Despliegue de variables!</h1>
        <br/><br/>
        Variables de alcance request: 
        ${mensaje}
        <br/><br/>
        variable de alcance session: <br/>
        ${rectangulo}<br/>
        Altura: ${rectangulo.altura}<br/>
        Base: ${rectangulo.base}<br/>
        Area: ${rectangulo.area}
        <br/><br/>
        <a href="index.jsp">Regresar al inicio  </a>
    </body>
</html>
