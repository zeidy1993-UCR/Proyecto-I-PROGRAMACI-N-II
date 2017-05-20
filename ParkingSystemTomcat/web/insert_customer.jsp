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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar cliente</title>
    </head>
    <body background="Images/fondo.jpg">
        <i>
            <marquee <b><font color="white" size="8">Ingreso de Clientes al Sistema </font></b>
            </marquee>
        </i>
    <center>
        <font color="white">
        <h2> Formulario de ingreso de clientes </h2>
        </font>
        <form action="CustomerInfoServlet" method="get">

            <table align="center">
                <tr>
                    <td> <font size="5" color="white"><b> <label>Identificación: </label> </b></font></td>

                    <td><input type="text" name="identification" size="30"></td>
                </tr>
                <tr>
                    <td> <font size="5" color="white"><b> <label>Nombre: </label> </b></font></td>

                    <td><input type="text" name="name" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="white"><b> <label>Correo: </label> </b></font></td>
                    <td><input type="text" name="email" size="30"></td>
                </tr>
                <tr>
                    <td> <font size="5" color="white"><b> <label>Telefono: </label> </b></font></td>
                    <td><input type="text" name="phone" size="30"></td>
                </tr>

                <tr>
                    <td><font size="5" color="white"><b> <label>Username: </label> </b></font></td>
                    <td><input type="text" name="username" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="white"><b> <label>Password: </label> </b></font></td>
                    <td><input type="text" name="password" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="white"><b> <label>Discapacidad: </label> </b></font></td>
                    <td>
                <form action="">
                    <font color="white"><input type="radio"  name="disabilityPresented" value="true"> Sí<br></font>
                     <font color="white"><input type="radio"  name="disabilityPresented" value="false"> No<br></font>
                </form></td>
                </tr>
            </table>
            <input type="submit" value="Guardar cliente" />
            <input type="reset" value="Cancelar" />
        </form>
    </center>
</body>
</html>