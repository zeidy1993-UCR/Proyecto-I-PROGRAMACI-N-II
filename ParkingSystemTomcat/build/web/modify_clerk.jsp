<%-- 
    Document   : insert_customer
    Created on : Apr 20, 2017, 5:50:57 PM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Modificar Empleado</title>
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
                top: 148px;

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
                            <li><a href="/GraphicReservation.jsp"> Parqueos</a>
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
                <font color="15377d">
                <h2> Formulario de modificación de empleados </h2>
                </font>
                <br><br>
                <form name="modifyClerkForm" action="ClerkManagementServlet.do" method="post">

                    <table align="center">
                        <tr>
                            <td> <font size="5" color="15377d"><b> <label>Identificación: </label> </b></font></td>

                            <td><input type="text" name="identification" size="30" value="${clerk.identification}"></td>
                        </tr>

                        <tr>
                            <td> <font size="5" color="15377d"><b> <label>Nombre: </label> </b></font></td>

                            <td><input type="text" name="name" size="30" value="${clerk.name}"></td>
                        </tr>
                        <tr>
                            <td><font size="5" color="15377d"><b> <label>Correo: </label> </b></font></td>
                            <td><input type="text" name="email" size="30" value="${clerk.email}"></td>
                        </tr>
                        <tr>
                            <td> <font size="5" color="15377d"><b> <label>Telefono: </label> </b></font></td>
                            <td><input type="text" name="phone" size="30" value="${clerk.phone}"></td>
                        </tr>
                        <tr>
                            <!--  <td><font size="5" color="15377d"><b> <label>Username: </label> </b></font></td>-->
                            <td><input type="hidden" name="username" size="30" value="${clerk.username}"></td>
                        </tr>
                        <tr>
                            <td><font size="5" color="15377d"><b> <label>Password: </label> </b></font></td>
                            <td><input type="text" name="password" size="30" value="${clerk.password}"></td>
                        </tr>
                        <tr>
                            <td><font size="5" color="15377d"><b> <label>Lugar de Trabajo: </label> </b></font></td>
                            <td><input type="text" name="placeOfWork" size="30" value="${clerk.placeOfWork}"></td>
                        </tr>
                    </table>
                    <input type="submit" value="Modificar empleado" />
                    <input type="reset" value="Cancelar" />
                </form>
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
