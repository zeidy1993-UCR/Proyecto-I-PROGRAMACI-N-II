<%-- 
    Document   : main_menu_customer
    Created on : 30/05/2017, 10:20:57 AM
    Author     : Zeii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Menú Principal Cliente</title>
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
                top: 109px;

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
                padding:10px 63px;
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
            <a href="./main_menu_customer.jsp">
                <img src="Images/JSP/jsp_01.jpg" width="164" height="105" alt=""></a></td>
        <td>
            <img src="Images/JSP/jsp_02.jpg" width="604" height="105" alt=""></td>
    </tr>
    <tr>
        <td colspan="2">
             <div id="header">
                        <ul class="nav">
                            <li><a href="./index.jsp">Inicio</a></li>
                            <li><a href="">Configuración</a>
                                <ul>
                                    <li><a href="">Reservaciones</a>
                                        <ul>
                                            <li><a href="">Consultar</a></li>
                                        </ul>

                                    </li>
                                    <li><a href="">Editar Perfil</a>

                                          <ul>
                                            <li><a href="./insert_customer.jsp">Insertar</a></li>
                                            <li><a href="CustomerRetrievalServlet">Consultar</a>
                                                <ul>
                                                    <li><a href="CustomerRetrievalServlet">Modificar</a></li>
                                                    <li><a href="CustomerRetrievalServlet">Eliminar</a></li>
                                                </ul>
                                            <li><a href="./insert_vehicle.jsp">Insertar Vehiculo</a></li>
                                            <li><a href="VehicleRetrievalServlet">Consultar Vehiculo</a>
                                            <li>
                                        </ul>
                                    </li>

                                </ul>
                            </li>
                            <li><a href="">Parqueos</a>
                                <ul>
                                    <li><a href="">Consultar Parqueos</a></li>
                                </ul>
                            </li>
                            <li><a href="ScheduleRetrievalServlet">Horario</a></li>
                        </ul>
                    </div>
            </td>
    </tr>
    <tr>
        <td colspan="2">
            <img src="Images/JSP/jsp_04.jpg" width="768" height="684" alt=""></td>
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