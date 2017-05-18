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
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>Modificar Vehiculo</title>
    </head>
    <body background="Images/background-image.gif">
        <i>
            <marquee <b><font color="lightgreen" size="8">Modificación de Vehiculos </font></b>
            </marquee>
        </i>
    <center>
         <font color="lightgreen">
        <h2> Formulario de modificación de vehiculos </h2>
        </font>
        <form name="modifyVehicleForm" action="VehicleManagementServlet.do" method="post">

            <table align="center">
                <tr>
                   <td> <font size="5" color="lightgreen"><b> <label>Placa: </label> </b></font></td>
                    
                   <td><input type="text" name="plate" size="30" value="${vehicle.plate}"></td>
                </tr>
                
                <tr>
                   <td> <font size="5" color="lightgreen"><b> <label>Marca: </label> </b></font></td>
                    
                   <td><input type="text" name="brand" size="30" value="${vehicle.brand}"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Nombre Cliente: </label> </b></font></td>
                    <td><input type="text" name="customerName" size="30" value="${vehicle.customerName}"></td>
                </tr>
                <tr>
                   <td> <font size="5" color="lightgreen"><b> <label>Tipo de Vehiculo: </label> </b></font></td>
                    <td><input type="text" name="id" size="30" value="${vehicle.id}"></td>
                </tr>
                <tr>
                   <td> <font size="5" color="lightgreen"><b> <label>Descripcion: </label> </b></font></td>
                    <td><input type="text" name="description" size="30" value="${vehicle.descipcion}"></td>
                </tr>
                
            </table>
            <input type="submit" value="Modificar cliente" />
            <input type="reset" value="Cancelar" />
        </form>
    </center>
 <a href="javascript:history.go(-1)">Página Anterior </a><br>
    <a href="javascript:history.go(1)">Página Siguiente</a><br>

</body>
</html>
