<%-- 
    Document   : index
    Created on : 17/05/2017, 02:29:21 PM
    Author     : Zeii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Web Park Car</title>
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
                padding:10px 70px;
                display:block;
            }

            .nav li a:hover {
                background-color:#434343;
            }

            .nav li ul {
                display:none;
                position:absolute;
                min-width:200px;
            }

            .nav li:hover > ul {
                display:block;
            }

            .nav li ul li {
                position:relative;
            }

            .nav li ul li ul {
                right:-200px;
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
                        <img src="Images/Index/webparkar_01.jpg" width="164" height="105" alt=""></a></td>
                <td>
                    <img src="Images/Index/webparkar_02.jpg" width="386" height="105" alt=""></td>
                <td>
                    <a href="./customer_login.jsp">
                        <img src="Images/Index/webparkar_03.jpg" width="218" height="105" alt=""></a></td>
            </tr>
            <tr>
                <td colspan="3">
                    <div id="header" align="center">
                        <ul class="nav">
                            <li><a href="./index.jsp">Inicio</a></li>
                            <li><a href="">Parqueos</a>
                                <ul>

                                    <li><a href="">Consultar</a>
                                    </li>
                                </ul>
                            </li>
                            <li><a href="">Tarifas</a>
                                <ul>
                                    <li><a href="">Consultar</a>

                                    </li>
                                </ul>
                            </li>
                            <li><a href="./Schedule.jsp">Horario</a></li>
                        </ul>
                    </div></td>
            </tr>
            <tr>
                <td colspan="3">
                    <img src="Images/Index/webparkar_05.jpg" width="768" height="684" alt="">
                    <a href="./administrator_login.jsp">Login Administrador</a><br>
                    <a href="./clerk_login.jsp">Login Clerk</a><br>
                </td>
            </tr>

            <tr>
                <td colspan="3">
                    <img src="Images/Index/webparkar_06.jpg" width="768" height="157" alt=""></td>
            </tr>
        </table>
        <!-- End Save for Web Slices -->
    </body>
</html>