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
        <title>Modificar administrador</title>
    </head>
    <body background="Images/fondo.jpg">
        <i>
            <marquee <b><font color="lightgreen" size="8">Modificación de Administradores </font></b>
            </marquee>
        </i>
    <center>
         <font color="lightgreen">
        <h2> Formulario de modificación de Administradores </h2>
        </font>
        <form name="modifyAdministradoresForm" action="AdministratorManagementServlet.do" method="post">

            <table align="center">
                <tr>
                   <td> <font size="5" color="lightgreen"><b> <label>Identificación: </label> </b></font></td>
                    
                   <td><input type="text" name="name" size="30" value="${administrador.identification}"></td>
                </tr>
                
                <tr>
                   <td> <font size="5" color="lightgreen"><b> <label>Nombre: </label> </b></font></td>
                    
                   <td><input type="text" name="name" size="30" value="${administrador.name}"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Correo: </label> </b></font></td>
                    <td><input type="text" name="email" size="30" value="${administrador.email}"></td>
                </tr>
                <tr>
                   <td> <font size="5" color="lightgreen"><b> <label>Telefono: </label> </b></font></td>
                    <td><input type="text" name="phone" size="30" value="${administrador.phone}"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Username: </label> </b></font></td>
                    <td><input type="text" name="username" size="30" value="${administrador.username}"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Password: </label> </b></font></td>
                    <td><input type="text" name="password" size="30" value="${administrador.password}"></td>
                </tr>
            </table>
            <input type="submit" value="Modificar Administrador" />
            <input type="reset" value="Cancelar" />
        </form>
    </center>
 <a href="javascript:history.go(-1)">Página Anterior </a><br>
    <a href="javascript:history.go(1)">Página Siguiente</a><br>

</body>
</html>
