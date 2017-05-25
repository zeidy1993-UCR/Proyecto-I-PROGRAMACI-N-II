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
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>Ingresar Vehiculo</title>
    </head>
    <body background="Images/background-image.gif">
        <i>
            <marquee<b><font color="lightgreen" size="8">Ingreso de Vehiculos al Sistema </font></b>
            </marquee>
        </i>
    <center>
        <font color="lightgreen">
        <h2> Formulario de ingreso de vehiculos </h2>
        </font>
        <form action="VehicleInfoServlet" method="get">

            <table align="center">

                <tr>
                    <td> <font size="5" color="lightgreen"><b> <label>Placa: </label> </b></font></td>

                    <td><input type="text" name="plate" size="30"></td>
                </tr>
                <tr>
                    <td> <font size="5" color="lightgreen"><b> <label>Marca: </label> </b></font></td>

                    <td><input type="text" name="brand" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Username del Cliente: </label> </b></font></td>
                    <td><input type="text" name="username" size="30"></td>

                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Username del Segundo Cliente: </label> </b></font></td>
                    <td><input type="text" name="username2" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Tipo de vehiculo: </label> </b></font></td>

                    <td><font color="lightgreen" size="3"><input type="radio" name="id" value="motocicleta">Motocicleta <br></font>
                        <font color="lightgreen" size="3"><input type="radio" name="id" value="automovil"> Automovil<br></font>
                        <font color="lightgreen" size="3"><input type="radio" name="id" value="microbus"> Microbus<br></font></td>

                </tr>

                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Descripcion del vehiculo: </label> </b></font></td>
                    <td><input type="text" name="description" size="30"></td>
                </tr>

            </table>
            <input type="submit" value="Guardar vehiculo" />
            <input type="reset" value="Cancelar" />
        </form>
    </center>

</body>
</html>
