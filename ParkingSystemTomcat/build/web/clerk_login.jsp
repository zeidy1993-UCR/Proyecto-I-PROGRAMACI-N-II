<%-- 
    Document   : clerk_login
    Created on : 30/05/2017, 01:41:11 PM
    Author     : Zeii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Iniciar Sesión</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    </head>
    <body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
        <!-- Save for Web Slices (user_login.psd) -->
    <center>
        <table id="Tabla_01" width="768" height="1025" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td colspan="2">
                    <a href="./index.jsp">
                    <img src="Images/userLogin/user_login_01.jpg" width="206" height="208" alt=""></a></td>
                <td colspan="2">
                    <img src="Images/userLogin/user_login_02.jpg" width="562" height="208" alt=""></td>
            </tr>
            <tr>
                <td colspan="4">
                    <img src="Images/userLogin/user_login_03.jpg" width="768" height="42" alt=""></td>
            </tr>
            <tr>
                <td>
                    <img src="Images/userLogin/user_login_04.jpg" width="177" height="65" alt=""></td>
                <td colspan="2">
            <marquee <b><font color="15377d" size="7">Bienvenido</font></b>
            </marquee>

        </td>
        <td>
            <img src="Images/userLogin/user_login_06.jpg" width="162" height="65" alt=""></td>
    </tr>
    <tr>
        <td colspan="4">
    <center>
        <form name="loginForm" action="ClerkInfoServlet" method="post">

            <font color="15377d" ><h3 align="center"><label>Usuario:</label></h3>
            </font>
            <input type="text" name="username" value="" size="30" />
            <font color="15377d" ><h3 align="center"><label>Contraseña:</label></h3>
            </font>
            <input type="password" name="password" value="" size="30"/>
            <br>
            <input type="submit" value="Ingresar" name="login" />
            <input type="reset" value="Cancelar" name="cancel" />
        </form>
    </center>

</td>
</tr>
<tr>
    <td colspan="4">
        <img src="Images/userLogin/user_login_08.jpg" width="768" height="157" alt=""></td>
</tr>
<tr>
    <td>
        <img src="Images/userLogin/espacio.gif" width="177" height="1" alt=""></td>
    <td>
        <img src="Images/userLogin/espacio.gif" width="29" height="1" alt=""></td>
    <td>
        <img src="Images/userLogin/espacio.gif" width="400" height="1" alt=""></td>
    <td>
        <img src="Images/userLogin/espacio.gif" width="162" height="1" alt=""></td>
</tr>
</table>
    </center>
<!-- End Save for Web Slices -->
</body>
</html>