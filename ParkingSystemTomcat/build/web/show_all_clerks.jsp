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
         <title>Mostrar todos los Empleados</title>
        <style type="text/css">

            * {
                margin:0px;
                padding:0px;
            }

            #header {
                margin:none;
                width: 768px;
                font-family:Arial, Helvetica, sans-serif;
                position: absolute;
                top: 220px;

            }

            ul, ol {
                list-style:none;
            }

            .nav > li {
                float:left;
            }

            .nav li a {
                background-color:#000;
                color:#fff;
                text-decoration:none;
                padding:10px 89px;
                display:block;
            }

            .nav li a:hover {
                background-color:#434343;
            }

            .nav li ul {
                display:none;
                position:absolute;
                min-width:180px;
            }

            .nav li:hover > ul {
                display:block;
            }

            .nav li ul li {
                position:relative;
            }

            .nav li ul li ul {
                right:-180px;
                top:0px;
            }

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    </head>
    <body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
        <!-- Save for Web Slices (jsp.psd) -->
    <center>
        <table id="Tabla_01" width="768" height="1024" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <a href="./main_menu_clerk.jsp">
                        <img src="Images/JSP/jsp_01.jpg" width="164" height="105" alt=""></a></td>
                <td>
                    <img src="Images/JSP/jsp_02.jpg" width="604" height="105" alt=""></td>
            </tr>
            <tr>
                <td colspan="2">
                    <div id="header">
                        <ul class="nav">
                            <li><a href="">Configuración</a>
                                <ul>
                                    <li><a href="">Clientes</a>
                                        <ul>
                                            <li><a href="./insert_customer.jsp">Insertar</a></li>
                                            <li><a href="CustomerRetrievalServlet">Consultar</a>
                                                <ul>
                                                    <li><a href="CustomerRetrievalServlet">Modificar</a></li>
                                                    <li><a href="CustomerRetrievalServlet">Eliminar</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li><a href="">Vehiculos</a>
                                        <ul>
                                            <li><a href="./insert_vehicle.jsp">Insertar</a></li>
                                            <li><a href="VehicleRetrievalServlet">Consultar</a>
                                                <ul>
                                                    <li><a href="VehicleRetrievalServlet">Modificar</a></li>
                                                    <li><a href="VehicleRetrievalServlet">Eliminar</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>

                                </ul>
                            </li>
                            <li><a href=""> Parqueos</a>
                                <ul>
                                    <li><a href="">Insertar</a></li>
                                    <li><a href="">Consultar</a>
                                        <ul>
                                            <li><a href="">Modificar</a></li>
                                            <li><a href="">Eliminar</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="">Tarifas</a></li>
                                </ul>
                            <li><a href="">Reportes</a></li>
                    </div>
                </td>
            </tr>
            <tr>
                <td colspan="2">
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
                <td colspan="2">
                    <img src="Images/JSP/jsp_05.jpg" width="768" height="157" alt=""></td>
            </tr>
        </table>
    </center>
    <!-- End Save for Web Slices -->
</body>
</html>
