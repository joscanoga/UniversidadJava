<%-- 
    Document   : setterJSP
    Created on : 7/04/2024, 8:46:14 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificardor de javabean</title>
    </head>
    <body>
       <h1>Modificardor de javabean</h1>
        <jsp:useBean id="Rectangulo" class="beans.Rectangulo" scope="session"/>
        Modificamos los atributos
        <br/><br/>
        <%
            int baseValor=5;
            int alturaValor=10;
        
        %>
        <jsp:setProperty name="Rectangulo" property="base" value="<%=baseValor %>"/>
        <jsp:setProperty name="Rectangulo" property="altura" value="<%=alturaValor %>"/>
        <br/><br/>
        Nuevo valor de base: <%=baseValor %>
        <br/>
        Nuevo valor de altura: <%=alturaValor %>
        <br/><br/>
        <a href="index.jsp">regresar al inicio</a>
    </body>
</html>
