<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta rol</title>
<%@ include file="cabecera.jsp" %>  
</head>
<body>
	<form  action="../Rol">
		<span class="subtitle">Rol:</span> 
		<br> 
		<input type="text" name="rolnuevo" value="">
		<br>
		<input type="submit" value="Rol" action="Rol">
	</form>
</body>
</html>