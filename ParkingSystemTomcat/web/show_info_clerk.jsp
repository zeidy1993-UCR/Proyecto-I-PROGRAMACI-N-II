<%-- 
    Document   : show_info_clerk
    Created on : 20/04/2017, 07:14:01 PM
    Author     : Zeii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente insertado</title>
        <%
            String identification = request.getParameter("identification");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String placeOfWork= request.getParameter("placeOfWork");

        %>
    </head>
    <body background="http://www.bloggang.com/data/k/kikaii/picture/1351094767.jpg" style="background-repeat: no-repeat; ">
        Datos del empleado insertado:<br>
        Identificación:<%=identification%><br>
        Nombre: <%=name%><br>
        Correo: <%=email%><br>
        Teléfono: <%=phone%><br>
        Usuario: <%=username%><br>
        Password: <%=password%><br>
        Lugar de Trabajo:<%=placeOfWork%><br>
    </body>
</html>
