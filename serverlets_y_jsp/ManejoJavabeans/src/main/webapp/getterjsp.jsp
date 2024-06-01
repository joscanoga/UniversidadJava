<%-- 
    Document   : getterjsp
    Created on : 7/04/2024, 8:48:40 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>lector de javabean</title>
    </head>
    <body>
        <h1>lector de javabean</h1>
        <jsp:useBean id="Rectangulo" class="beans.Rectangulo" scope="session"/>
        Rectangulo:
        Valor Base: <jsp:getProperty name="Rectangulo" property="base"/>
        <br/>
        Valor Altura: <jsp:getProperty name="Rectangulo" property="altura"/>
        <br/>
        Valor Area: <jsp:getProperty name="Rectangulo" property="area"/>
        <br/>
        <a href="index.jsp">regresar al inicio</a>
    </body>
</html>
