<%-- 
    Document   : menejoErrores
    Created on : 6/04/2024, 5:40:19 p. m.
    Author     : johan
--%>
<%@page isErrorPage="true" %>
<%@page import="java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de erroes</title>
    </head>
    <body>
        <h1>manejo de errores!</h1>
        <br/>
        Ocurrio una excepcion: <%= exception.getMessage() %>
        <br/>
        <textarea cols="30" rows="5">
                <% exception.printStackTrace(new PrintWriter(out)); %>
        </textarea>
        
    </body>
</html>
