<%-- 
    Created on : 27/04/2017, 06:10:24 PM
    Author     : Zeii
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>Horario </title>
    </head>
    <body >
        <i>
            <marquee <b><font color="lightgreen" size="8">Horario </font></b>
            </marquee>
        </i>
        <br><br><br>
    <center>
        <table align="center" border="5">
            <center>
                <table border="2">
                    <td bgcolor="white" ><font size="5" color="#00009C"> <center><b>Horario</b> </center></font> </td>

                    <tr >
                        <%  Object variable = request.getAttribute("schedules"); %>
                        <td><font size="5"><p> <%= variable %></p></font> </td>
                    </tr>
                </table>
            </center>
            </body>
            </html>
