<%-- 
    Document   : show_all_customers
    Created on : 27/04/2017, 06:10:24 PM
    Author     : Zeii
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>Listado de vehiculos</title>
    </head>
    <body background="Images/background-image.gif">
        <i>
            <marquee <b><font color="lightgreen" size="8">Lista de Vehiculos en el Sistema </font></b>
            </marquee>
        </i>
        <br><br><br>
    <center>
        <table align="center" border="5">
            <center>
                <table border="2">
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Placa</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Marca</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Nombre del cliente</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Tipo de vehiculo</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Descricion del vehiculo</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Acción</b></font> </td>


                    <c:forEach items="${vehicles}" var="currentVehicle" varStatus="counter">
                        <c:set var="color" value="${counter.index%2==0? 'gray' : 'lightblue'}"/>
                        <tr bgcolor= "${color}">
                            <td><font size="5"><c:out value="${currentVehicle.plate}"/> </font> </td>
                            <td><font size="5"><c:out value="${currentVehicle.brand}"/> </font> </td>
                            <td><font size="5"><c:out value="${currentVehicle.username}"/></font></td>
                            <td><font size="5"><c:out value="${currentVehicle.id}"/></font></td>
                            <td><font size="5"><c:out value="${currentVehicle.descripcion}"/></font></td>
                            <td><font size="5"><a
                                    href="VehicleManagementServlet.do?action=edit&vehiclePlate=<c:out
                                        value="${currentVehicle.plate}"/>">Modificar</a></font>
                                <font size="5"><a
                                    href="VehicleManagementServlet.do?action=delete&vehiclePlate=<c:out
                                        value="${currentVehicle.plate}"/>">Eliminar</a></font></td>
                        </tr>
                    </c:forEach>
                </table>
            </center>
            <a href="javascript:history.go(-1)">Página Anterior </a><br>
            <a href="javascript:history.go(1)">Página Siguiente</a><br>
            </body>
            </html>
