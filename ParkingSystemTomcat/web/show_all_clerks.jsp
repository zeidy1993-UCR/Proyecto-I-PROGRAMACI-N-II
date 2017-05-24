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
    <body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
        <!-- Save for Web Slices (jsp.psd) -->
    <center>
        <table id="Tabla_01" width="768" height="1024" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <img src="Images/jsp_01.jpg" width="768" height="105" alt=""></td>
            </tr>
            <tr>
                <td>
            <center>
                <table border="2">

                        <td bgcolor="white" ><font size="4" color="#00009C"><b>Id</b></font> </td>
                        <td bgcolor="white" ><font size="4" color="#00009C"><b>Nombre</b></font> </td>
                        <td bgcolor="white" ><font size="4" color="#00009C"><b>Correo</b></font> </td>
                        <td bgcolor="white" ><font size="4" color="#00009C"><b>Teléfono</b></font> </td>
                        <td bgcolor="white" ><font size="4" color="#00009C"><b>Usuario</b></font> </td>
                        <td bgcolor="white" ><font size="4" color="#00009C"><b>Lugar de Trabajo</b></font> </td>
                        <td bgcolor="white" ><font size="4" color="#00009C"><b>Acción</b></font> </td>

                    <c:forEach items="${clerks}" var="currentClerk" varStatus="counter">
                        <c:set var="color" value="${counter.index%2==0? 'gray' : 'lightblue'}"/>
                        <tr bgcolor= "${color}">
                            <td><font size="3"><c:out value="${currentClerk.identification}"/> </font> </td>
                            <td><font size="3"><c:out value="${currentClerk.name}"/> </font> </td>
                            <td><font size="3"><c:out value="${currentClerk.email}"/></font></td>
                            <td><font size="3"><c:out value="${currentClerk.phone}"/></font></td>
                            <td><font size="3"><c:out value="${currentClerk.username}"/></font></td>
                            <td><font size="3"><c:out value="${currentClerk.placeOfWork}"/></font></td>
                            <td><font size="3"><a
                                    href="ClerkManagementServlet.do?action=edit&clerkUsername=<c:out
                                        value="${currentClerk.username}"/>">Modificar</a></font>
                                <font size="3"><a
                                    href="ClerkManagementServlet.do?action=delete&clerkUsername=<c:out
                                        value="${currentClerk.username}"/>">Eliminar</a></font></td>
                        </tr>
                    </c:forEach>
                </table>
            </center>
            </td>
            </tr>
            <tr>
                <td>
                    <img src="Images/jsp_04.jpg" width="768" height="157" alt=""></td>
            </tr>
        </table>
    </center>
</body>
</html>
