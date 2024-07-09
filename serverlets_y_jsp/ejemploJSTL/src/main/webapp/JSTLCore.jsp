<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL CORE</title>
    </head>
    <body>
        <h1>JSTL CORE(JSP STANDART TAG LIBRARY)</h1>
        <!-- MANIPULACION DE VARIABLES -->
        <!-- se define la veriable -->
        <c:set var="nombre" value="ernesto"/>
        <!-- se muestra la veriable -->
        Varible nombre: <c:out value="${nombre}"/>
        <br/><br/> 
        variable codigo html: 
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br/><br/> 
        <!-- condicional -->
        <c:set var="bandera" value="true"/>
        <c:if test="${bandera}">
            la bandera es verdadera
        </c:if>
            
       <br/><br/>
       <!-- uso de chose(switch) -->
       <c:if test="${param.opcion!=null}">
           <c:choose>
               <c:when test="${param.opcion==1}">
                   <br/>
                   Opcion 1 seleccionada
               </c:when>
               <c:when test="${param.opcion==2}">
                   <br/>
                   Opcion 2 seleccionada
               </c:when>
               <c:otherwise>
                   <br/> 
                   Cualquier cotro caso: ${param.opcion}
               </c:otherwise>
           </c:choose>
       </c:if>
        <!-- iterador-->
        <% %>
        <%
            String nombres[]={"a","b","c"};
            request.setAttribute("nombres",nombres);
        %>
        <br/>
        lista
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>nombre: ${persona}</li>
            </c:forEach>
        </ul>
        <br/>
        <a href="index.jsp">regresar al inicio</a>
        
    </body>
</html>
