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
        <title>Listado de empleados</title>
    </head>
    <body background="Images/fondo.jpgf">
        <i>
            <marquee <b><font color="lightgreen" size="8">Lista de Empleados en el Sistema </font></b>
            </marquee>
        </i>
        <br><br><br>
    <center>
        <table align="center" border="5">
            <center>
                <table border="2">
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Identificación</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Nombre del cliente</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Correo electrónico</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Teléfono</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Usuario</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Lugar de Trabajo:</b></font> </td>
                    <td bgcolor="white" ><font size="5" color="#00009C"><b>Acción</b></font> </td>


                    <c:forEach items="${clerks}" var="currentClerk" varStatus="counter">
                        <c:set var="color" value="${counter.index%2==0? 'gray' : 'lightblue'}"/>
                        <tr bgcolor= "${color}">
                            <td><font size="5"><c:out value="${currentClerk.identification}"/> </font> </td>
                            <td><font size="5"><c:out value="${currentClerk.name}"/> </font> </td>
                            <td><font size="5"><c:out value="${currentClerk.email}"/></font></td>
                            <td><font size="5"><c:out value="${currentClerk.phone}"/></font></td>
                            <td><font size="5"><c:out value="${currentClerk.username}"/></font></td>
                            <td><font size="5"><c:out value="${currentClerk.placeOfWork}"/></font></td>
                            <td><font size="5"><a
                                    href="ClerkManagementServlet.do?action=edit&clerkUsername=<c:out
                                        value="${currentClerk.username}"/>">Modificar</a></font>
                                <font size="5"><a
                                    href="ClerkManagementServlet.do?action=delete&clerkUsername=<c:out
                                        value="${currentClerk.username}"/>">Eliminar</a></font></td>
                        </tr>
                    </c:forEach>
                </table>
            </center>
            <a href="javascript:history.go(-1)">Página Anterior </a><br>
            <a href="javascript:history.go(1)">Página Siguiente</a><br>
            </body>
            </html>
