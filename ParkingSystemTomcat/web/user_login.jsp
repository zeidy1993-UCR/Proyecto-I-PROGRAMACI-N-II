<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Ingreso al Sistema</title>
    </head>
    <body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- Save for Web Slices (user_login.psd) -->
<center>
<table id="Tabla_01" width="768" height="1024" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="3">
			<img src="Images/user_login_01.jpg" width="768" height="208" alt=""></td>
	</tr>
	<tr>
		<td colspan="3">
			<img src="Images/user_login_02.jpg" width="768" height="42" alt=""></td>
	</tr>
	<tr>
		<td>
			<img src="Images/user_login_03.jpg" width="177" height="65" alt=""></td>
		<td>
			 <marquee <b><font color="15377d" size="7">Bienvenido</font></b>
                </marquee>
		<td>
			<img src="Images/user_login_05.jpg" width="162" height="65" alt=""></td>
	</tr>
	<tr>
		<td colspan="3">
			<center>
        <form name="loginForm" action="CustomerInfoServlet" method="post">
  
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
    </center></td>
	</tr>
	<tr>
		<td colspan="3">
			<img src="Images/user_login_07.jpg" width="768" height="157" alt=""></td>
	</tr>
</table>
</center>
<!-- End Save for Web Slices -->
</body>
</html>

