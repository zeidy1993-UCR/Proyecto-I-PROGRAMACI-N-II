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
        <title>Modificar cliente</title>
    </head>
    <body background="Images/fondo.jpg">
        <i>
            <marquee <b><font color="lightgreen" size="8">Modificación de Clientes </font></b>
            </marquee>
        </i>
    <center>
        <font color="lightgreen">
        <h2> Formulario de modificación de clientes </h2>
        </font>
        <form name="modifyCustomerForm" action="CustomerManagementServlet.do" method="post">

            <table align="center">
                <tr>
                    <td> <font size="5" color="lightgreen"><b> <label>Identificación: </label> </b></font></td>

                    <td><input type="text" name="identification" size="30" value="${customer.identification}"></td>
                </tr>
                <tr>
                    <td> <font size="5" color="lightgreen"><b> <label>Nombre: </label> </b></font></td>

                    <td><input type="text" name="name" size="30" value="${customer.name}"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Correo: </label> </b></font></td>
                    <td><input type="text" name="email" size="30" value="${customer.email}"></td>
                </tr>
                <tr>
                    <td> <font size="5" color="lightgreen"><b> <label>Telefono: </label> </b></font></td>
                    <td><input type="text" name="phone" size="30" value="${customer.phone}"></td>
                </tr>

                <td><font size="5" color="lightgreen"><b> <label>Password: </label> </b></font></td>
                <td><input type="text" name="password" size="30" value="${customer.password}"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Discapacidad: </label> </b></font></td>
                    <td>
                        <form action="">
                            <font color="white"><input type="radio"  name="disabilityPresented" value="true"> Sí<br></font>
                            <font color="white"><input type="radio"  name="disabilityPresented" value="false"> No<br></font>

                        </form></td>
                </tr>
                <tr>
                    <td><input type=hidden name="username" size="30" value="${customer.username}"></td>
                </tr>
                <tr>
            </table>
            <input type="submit" value="Modificar cliente" />
            <input type="reset" value="Cancelar" />
        </form>
    </center>


</body>
</html>
