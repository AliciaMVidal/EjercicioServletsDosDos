<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="true"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta usuario</title>

</head>
<body>
    <script src ="ValidarLogin.js" type="text/javascript"></script>

	<form action="../DarAltaUsuario">
		<h1>Login</h1>
		<br> <br>
		 <span class="subtitle">Usuario:</span> 
		 <br>
		 <input type="text" id="newusername" name="newusername" value="">
		 <br> <span class="subtitle">Contraseña:</span> <br> 
		 <input type="password" id="password1" name="password1" value=""> <br>
		<br> 
		 <br> <span class="subtitle">Contraseña:</span> <br> 
		<input type ="password" id="password2" name="password2" value=""> <br>
		<br>
		<input type="submit" value="DarAltaUsuario"  onclick="return validar();" action="DarAltaUsuario">
	</form>
</body>
</html>