<%-- 
    Document   : newjsp
    Created on : Apr 20, 2017, 7:08:37 PM
    Author     : Esteban
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
            String aux = request.getParameter("disabilityPresented");
            boolean disabilityPresented = Boolean.parseBoolean(aux);


        %>
    </head>
    <body>

        Datos del cliente insertado:
        Identificación: <%=identification%>
        Nombre: <%=name%>
        Correo: <%=email%>
        Teléfono: <%=phone%>
        Usuario: <%=username%>
        Password: <%=password%>
        Discapacidad: <%=disabilityPresented%>

    </body>
</html>
