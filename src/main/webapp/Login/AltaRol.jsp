<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="true"%>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta rol</title>
</head>
<body>
<%@ include file="cabecera.jsp" %>  

	<form  action="../Rol">
		<span class="subtitle">Rol:</span> 
		<br> 
		<input type="text" name="rolnuevo" value="">
		<br>
		<input type="submit" value="Rol" action="Rol">
	</form>
</body>
</html>