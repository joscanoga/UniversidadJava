    <%-- 
    Document   : index
    Created on : 31/03/2024, 5:16:36 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola mundo JSP</title>
    </head>
    <body>
        <h1>Hola mundo JSP!</h1>
        <ul>
            <li><% out.print("hola mundo con scriplets"); %></li>
            <li>${"Hola Mundo con Expression languaje(EL)"}</li>
            <li><%="Hola Mundo con expresiones"%></li>
            <li><c:out value="Hola mundo con JSTL"/></li>
        </ul>

    </body>
</html>
