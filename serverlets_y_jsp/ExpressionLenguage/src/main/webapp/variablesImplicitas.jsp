<%-- 
    Document   : variablesImplicitas
    Created on : 8/04/2024, 6:10:40 a. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y variables implicitas</title>
    </head>
    <body>
        <h1>EL y variables implicitas</h1>
        <ul>
            <li>nombre de la aplicacion ${pageContext.request.contextPath}</li>
            <li>Navegador cliente ${header["User-Agent"]}</li>
            <li>ID Session: ${cookie.JSESSIONID.value}</li>
            <li>Web servlet: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro ${param.usuario}</li>
        </ul>

    </body>
</html>
