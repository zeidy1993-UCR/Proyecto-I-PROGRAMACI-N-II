<%-- 
    Document   : main_menu
    Created on : 27/04/2017, 04:32:21 PM
    Author     : Zeii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú principal</title>
        <%
            String name = response.getHeader("name");
        %>
    </head>
    <body background="Images/fondo.jpg">
        <font size=6 color=lightgreen> Bienvenido(a), <%=name%> </font>
        <i>
            <marquee <b><font color="lightgreen" size="8">Menú principal del Sistema </font></b>
            </marquee>
        </i>
        <table border="2" align="center" bgcolor="black" bordercolor="white">
            <tr>
                <td>
                    <font size="5" color="white">
                    1--> <a href="./insert_customer.jsp">Insertar cliente</a>
                    </font>
                </td>
            </tr>
            <tr>
                <td>
                    <font size="5" color="white">
                    2--> <a href="CustomerRetrievalServlet">Consultar clientes</a>
                    </font>
                </td>
            </tr>
            <tr>
                <td>
                    <font size="5" color="white">
                    3--> <a href="./insert_administrator.jsp">Insertar administrador</a>
                    </font>
                </td>
            </tr>
            <tr>
                <td>
                    <font size="5" color="white">
                    4--> <a href="AdministratorRetrievalServlet">Consultar administrador</a>
                    </font>
                </td>
            </tr>
                        <tr>
                <td>
                    <font size="5" color="white">
                    5--> <a href="./insert_clerk.jsp">Insertar empleado</a>
                    </font>
                </td>
            </tr>
                        <tr>
                <td>
                    <font size="5" color="white">
                    6--> <a href="ClerkRetrievalServlet">Consultar empleados</a>
                    </font>
                </td>
            </tr>
                       <tr>
                <td>
                    <font size="5" color="white">
                    7--> <a href="./insert_vehicle.jsp">Insertar vehiculo</a>
                    </font>
                </td>
            </tr>
                        <tr>
                <td>
                    <font size="5" color="white">
                    8--> <a href="VehicleRetrievalServlet">Consultar vehiculos</a>
                    </font>
                </td>
            </tr>
        </table>
    </body>
</html>
