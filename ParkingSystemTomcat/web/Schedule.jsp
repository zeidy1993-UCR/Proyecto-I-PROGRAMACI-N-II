<%-- 
    Created on : 27/04/2017, 06:10:24 PM
    Author     : Zeii
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>jsp</title>
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
                top: 158px;

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
                            <li><a href="ScheduleRetrievalServlet">Horario</a></li>
                        </ul>
                    </div>
            </td>
    </tr>
    <tr>
        <td colspan="2">
               <center>
            <center>
                <table border="2">
                    <td bgcolor="white" ><font size="5" color="#00009C"> <center><b>Horario</b> </center></font> </td>

                    <tr >
                        <%  Object variable = request.getAttribute("schedules"); %>
                        <td><font size="5"><p> <%= variable %></p></font> </td>
                    </tr>
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
