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
        <title>Modificar Administrador</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                top: 157px;

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
    </head>
    <body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
        <!-- Save for Web Slices (jsp.psd) -->
    <center>
        <table id="Tabla_01" width="768" height="1024" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <a href="./main_menu_administrator.jsp">
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
                                    <li><a href="./main_menu_administrator.jsp">Administradores</a>
                                        <ul>
                                            <li><a href="./insert_administrator.jsp">Insertar</a></li>
                                            <li><a href="AdministratorRetrievalServlet">Consultar</a>
                                                <ul>
                                                    <li><a href="AdministratorRetrievalServlet">Modificar</a></li>
                                                    <li><a href="AdministratorRetrievalServlet">Eliminar</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li><a href="">Empleados</a>
                                        <ul>
                                            <li><a href="./insert_clerk.jsp">Insertar</a></li>
                                            <li><a href="ClerkRetrievalServlet">Consultar</a>
                                                <ul>
                                                    <li><a href="ClerkRetrievalServlet">Modificar</a></li>
                                                    <li><a href="ClerkRetrievalServlet">Eliminar</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
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
                                    <li><a href="">Tarifas</a>
                                        <ul>
                                            <li><a href="">Insertar</a></li>
                                            <li><a href="">Consultar</a>
                                                <ul>
                                                    <li><a href="">Modificar</a></li>
                                                    <li><a href="">Eliminar</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            <li><a href="">Reportes</a></li>
                    </div>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <center>
         <font color="15377d">
        <h2> Formulario de modificación de Administradores </h2>
        </font>
        <br><br>
        <form name="modifyAdministradoresForm" action="AdministratorManagementServlet.do" method="post">

            <table align="center">
                <tr>
                   <td> <font size="5" color="15377d"><b> <label>Identificación: </label> </b></font></td>
                    
                   <td><input type="text" name="identification" size="30" value="${administrator.identification}"></td>
                </tr>
                
                <tr>
                   <td> <font size="5" color="15377d"><b> <label>Nombre: </label> </b></font></td>
                    
                   <td><input type="text" name="name" size="30" value="${administrator.name}"></td>
                </tr>
                <tr>
                    <td><font size="5" color="15377d"><b> <label>Correo: </label> </b></font></td>
                    <td><input type="text" name="email" size="30" value="${administrator.email}"></td>
                </tr>
                <tr>
                   <td> <font size="5" color="15377d"><b> <label>Telefono: </label> </b></font></td>
                    <td><input type="text" name="phone" size="30" value="${administrator.phone}"></td>
                </tr>
                <tr>
                     <!--<td><font size="5" color="15377d"><b> <label>Username: </label> </b></font></td>-->
                    <td><input type="hidden" name="username" size="30" value="${administrator.username}"></td>
                </tr>
                <tr>
                    <td><font size="5" color="15377d"><b> <label>Password: </label> </b></font></td>
                    <td><input type="text" name="password" size="30" value="${administrator.password}"></td>
                </tr>
            </table>
            <input type="submit" value="Modificar Administrador" />
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
