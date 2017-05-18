<%-- 
    Document   : show_info_customer
    Created on : 20/04/2017, 07:14:01 PM
    Author     : Zeii
--%>

<%@page import="Domain.Customer"%>
<%@page import="Business.CustomerBusiness"%>
<%@page import="Domain.VehicleType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vehiculo insertado</title>

        <%

            CustomerBusiness customerBusiness = new CustomerBusiness();
            //String identification, String name, String email, 
            //String phone, String username, String password, boolean disabilityPresented
            String plate = request.getParameter("plate");
            String brand = request.getParameter("brand");
            String usernameCustomer = request.getParameter("username");
            String id = request.getParameter("id");
            String description = request.getParameter("description");


        %>
    </head>
    <body background="http://www.bloggang.com/data/k/kikaii/picture/1351094767.jpg" style="background-repeat: no-repeat; ">
        Datos del vehiculo insertado:<br>
        Placa:<%=plate%><br>
        Marca: <%=brand%><br>
        Cliente: <%=usernameCustomer%><br>
        Tipo de Vehiculo: <%=id%><br>
        Descripcion <%=description%><br>


    </body>
</html>
