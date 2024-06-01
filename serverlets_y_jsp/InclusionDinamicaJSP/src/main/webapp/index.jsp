<%-- 
    Document   : index
    Created on : 6/04/2024, 11:26:36 p. m.
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>inclusion dimanica JSP</title>
    </head>
    <body>
        <h1>inclusion dimanica JSP!</h1>
        <br/>
        <ul>
            <li><jsp:include page="pages/RecursoPublicoJSP.jsp" /></li>
            <br/>
            <li>
                <jsp:include page="WEB-INF/recursoPrivado.jsp" >
                    <jsp:param name="colorFondo" value="yellow" />
                </jsp:include>
            </li>
            <li>third</li>
        </ul>

    </body>
</html>
