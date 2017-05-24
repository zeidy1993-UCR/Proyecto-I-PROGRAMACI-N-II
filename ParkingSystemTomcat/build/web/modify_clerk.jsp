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
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>Modificar empleado</title>
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
                padding:10px 61px;
                display:block;
            }

            .nav li a:hover {
                background-color:#434343;
            }

            .nav li ul {
                display:none;
                position:absolute;
                min-width:140px;
            }

            .nav li:hover > ul {
                display:block;
            }

            .nav li ul li {
                position:relative;
            }

            .nav li ul li ul {
                right:-140px;
                top:0px;
            }

        </style>
    </head>
    <body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
    <center>
        <table id="Tabla_01" width="768" height="1024" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <img src="Images/jsp_01.jpg" width="768" height="105" alt=""></td>
            </tr>
            <tr>
                <td>
                    <div id="header" align="center" >
                        <ul class="nav">
                            <li><a href="./index.jsp">Inicio</a></li>
                            <li><a href="">Configuración</a>
                                <ul>
                                    <li><a href="">Administrador</a>
                                        <ul>
                                            <li><a href="./insert_administrator.jsp">Insertar</a></li>
                                            <li><a href="AdministratorRetrievalServlet">Consultar</a></li>
                                            <li><a href="./modify_administrator.jsp">Modificar</a></li>
                                            <li><a href="./show_all_administrators.jsp">Eliminar</a></li>
                                        </ul>
                                    </li>

                                    <li><a href="">Empleados</a>
                                        <ul>
                                            <li><a href="">Insertar</a></li>
                                            <li><a href="">Consultar</a></li>
                                            <li><a href="">Modificar</a></li>
                                            <li><a href="">Eliminar</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li><a href="">Acerca de</a>
                                <ul>
                                    <li><a href="">Submenu1</a></li>
                                    <li><a href="">Submenu2</a></li>
                                    <li><a href="">Submenu3</a></li>
                                    <li><a href="">Submenu4</a></li>
                                </ul>
                            </li>
                            <li><a href="">Contacto</a></li>
                        </ul>
                    </div></td>
            </tr>
            <tr>
                <td>
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
                    <td><font size="5" color="15377d"><b> <label>Username: </label> </b></font></td>
                    <td><input disabled="" name="username" size="30" value="${clerk.username}"></td>
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
                </tr>
                <tr>
                    <td>
                        <img src="Images/jsp_04.jpg" width="768" height="157" alt=""></td>
                </tr>
        </table>
        <!-- End Save for Web Slices -->
    </center>
</body>
</html>
