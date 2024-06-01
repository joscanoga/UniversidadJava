<%-- 
    Document   : index
    Created on : 6/04/2024, 11:08:14 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>inclusion estatica JSP </title>
    </head>
    <body>
        <h1>inclusion estatica JSP!</h1>
        <ul>
            <li><%@include file="paginas/noticias1.html" %></li>
            <li><%@include file="paginas/noticias2.jsp" %></li>
            
        </ul>

    </body>
</html>
