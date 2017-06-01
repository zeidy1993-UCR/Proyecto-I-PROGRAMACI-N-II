<%-- 
    Document   : insert_customer
    Created on : 12/05/2017, 01:40:44 PM
    Author     : Zeii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Ingresar Vehículo</title>
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
                top: 153px;

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
                padding:10px 88px;
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
            <img src="Images/JSP/jsp_01.jpg" width="164" height="105" alt=""></td>
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
        <font color="15377d">
        <h2> Formulario de ingreso de vehiculos </h2>
        </font>
        <form action="VehicleInfoServlet" method="get">

            <table align="center">

                <tr>
                    <td> <font size="5" color="15377d"><b> <label>Placa: </label> </b></font></td>

                    <td><input type="text" name="plate" size="30"></td>
                </tr>
                <tr>
                    <td> <font size="5" color="15377d"><b> <label>Marca: </label> </b></font></td>

                    <td><input type="text" name="brand" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="15377d"><b> <label>Username del Cliente: </label> </b></font></td>
                    <td><input type="text" name="username" size="30"></td>

                </tr>
                <tr>
                    <td><font size="5" color="15377d"><b> <label>Username del Segundo Cliente: </label> </b></font></td>
                    <td><input type="text" name="username2" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="15377d"><b> <label>Tipo de vehiculo: </label> </b></font></td>

                    <td><font color="15377d" size="3"><input type="radio" name="id" value="motocicleta">Motocicleta <br></font>
                        <font color="15377d" size="3"><input type="radio" name="id" value="automovil"> Automovil<br></font>
                        <font color="15377d" size="3"><input type="radio" name="id" value="microbus"> Microbus<br></font></td>

                </tr>

                <tr>
                    <td><font size="5" color="15377d"><b> <label>Descripcion del vehiculo: </label> </b></font></td>
                    <td><input type="text" name="description" size="30"></td>
                </tr>

            </table>
            <input type="submit" value="Guardar vehiculo" />
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
