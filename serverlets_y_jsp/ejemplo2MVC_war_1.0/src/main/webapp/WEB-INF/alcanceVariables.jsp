<%-- 
    Document   : alcanceVariables
    Created on : 23/06/2024, 9:51:53 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>alcance Variables</title>
    </head>
    <body>
        <h1>alcance Variables!</h1>
        <br/><br/>
        Variable Request: <br/>
        &emsp Base: ${recRequest.base}<br/>
        &emsp Altura: ${recRequest.altura}<br/>
        &emsp Area: ${recRequest.area}<br/>
        
        <br/><br/>
        Variable session: <br/>
        &emsp Base: ${recSession.base}<br/>
        &emsp Altura: ${recSession.altura}<br/>
        &emsp Area: ${recSession.area}<br/>
        
        <br/><br/>
        Variable aplicacion: <br/>
        &emsp Base: ${recAplicacion.base}<br/>
        &emsp Altura: ${recAplicacion.altura}<br/>
        &emsp Area: ${recAplicacion.area}<br/>
        
        <br/><br/>
        <a href="${pageContext.request.contextPath}/index.jsp">regresar al inicio</a>
        
    </body>
</html>
