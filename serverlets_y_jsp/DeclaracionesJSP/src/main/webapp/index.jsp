<%-- 
    Document   : index
    Created on : 31/03/2024, 11:56:48 p. m.
    Author     : johan
--%>
<%--agregamos una declaracion --%>
<%! 
//declaramos una varible con su metodo get
private String usuario="Dario";
public String getUsuario(){
    return this.usuario;
}
//declaramos un contador de visitas
private int contadorVisitas=1;
public int getContadorVisitas(){
    return this.contadorVisitas;
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones con JSP </title>
    </head>
    <body>
        <h1>Declaraciones con JSP!</h1>
        Valor del usuario  por medio del atributo <%= this.usuario %>
        <br/> 
        valor del usuario por medio del metodo <%= this.getUsuario() %>
        <br/> 
        contador visitas: <%= this.contadorVisitas++ %>
    </body>
</html>
