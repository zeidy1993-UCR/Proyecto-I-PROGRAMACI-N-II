<%-- 
    Document   : index
    Created on : 17/05/2017, 02:29:21 PM
    Author     : Zeii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>webparkar</title>
        <style type="text/css">

            * {
                margin:0px;
                padding:0px;
            }

            #header {
                margin:inherit;
                width: 768px;
                font-family:Arial, Helvetica, sans-serif;
                position: absolute;
		top: 105px;
                
		
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
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    </head>
   <body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<!-- Save for Web Slices (webparkar.psd) -->
<table id="Tabla_01" width="768" height="1024" border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>
                <td>
                    <a href="./index.jsp">
                        <img src="Images/webparkar_01.jpg" width="164" height="105" alt=""></a></td>
                <td>
                    <img src="Images/webparkar_02.jpg" width="386" height="105" alt=""></td>
                <td>
                    <a href="./user_login.jsp">
                        <img src="Images/webparkar_03.jpg" width="218" height="105" alt=""></a></td>
            </tr>
            <tr>
                <td colspan="3">
                    <div id="header" align="center">
                        <ul class="nav">
                            <li><a href="./index.jsp">Inicio</a></li>
                            <li><a href="">Configuración</a>
                                <ul>
                                    <li><a href="">Administrador</a>
                                        <ul>
                                            <li><a href="./insert_administrator.jsp">Insertar</a></li>
                                            <li><a href="AdministratorRetrievalServlet">Consultar</a>
                                             <ul>
                                                <li><a href="AdministratorRetrievalServlet">Modificar</a></li>
                                            <li><a href="AdministratorRetrievalServlet">Eliminar</a>
                                            </ul>
                                            </li>
                                        </ul>
                                    </li>

                                    <li><a href="">Empleados</a>
                                        <ul>
                                            <li><a href="./insert_clerk.jsp">Insertar</a></li>
                                            <li><a href="ClerkRetrievalServlet">Consultar</a>
                                             <ul>
                                                <li><a href="ClerkRetrievalServlet">Modifificar</a></li>
                                            <li><a href="ClerkRetrievalServlet">Eliminar</a>
                                            </ul>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li><a href="">Parqueos</a>
                                <ul>
                                            <li><a href="">Insertar</a></li>
                                            <li><a href="">Consultar</a>
                                             <ul>
                                                <li><a href="">Modificar</a></li>
                                            <li><a href="">Eliminar</a>
                                            </ul>
                                            </li>
                                        </ul>
                            </li>
                            <li><a href="">Tarifas</a>
                                <ul>
                                            <li><a href="">Insertar</a></li>
                                            <li><a href="">Consultar</a>
                                             <ul>
                                                <li><a href="">Modificar</a></li>
                                            <li><a href="">Eliminar</a>
                                            </ul>
                                            </li>
                                        </ul>
                              </li>
                        </ul>
                    </div></td>
            </tr>
            <tr>
                <td colspan="3">
                    <img src="Images/webparkar_05.jpg" width="768" height="684" alt=""></td>
            </tr>
            <tr>
                <td colspan="3">
                    <img src="Images/webparkar_06.jpg" width="768" height="157" alt=""></td>
            </tr>
        </table>
        <!-- End Save for Web Slices -->
    </body>
</html>