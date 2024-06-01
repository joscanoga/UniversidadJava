<%-- 
    Document   : ReporteExcel
    Created on : 6/04/2024, 4:08:38 p. m.
    Author     : johan
--%>
<%@page errorPage="/WEB-INF/menejoErrores.jsp" %>
<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<% 
    String nombreArchivo="reporte.xls";
    response.setHeader("Content-Disposition","inline;filename="+nombreArchivo);
    
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1.fundamentos Java</td>
                <td>logica java</td>
                <td><%= Conversiones.format(new Date()) %></td>
            </tr>
            <tr>
                <td>2.programacion con java Java</td>
                <td>practica de la programacion orientada a objetos</td>
                <td><%= Conversiones.format(new Date())%></td>
            </tr>
        </table>
    </body>
</html>
