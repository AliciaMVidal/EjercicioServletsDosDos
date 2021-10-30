<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cabecera</title>
</head>
<body>
    <script src ="Volver.js" type="text/javascript"></script>

	<div>

		<p>cabecera</p>
		<p>
			<c:out value="${nombresesion}"></c:out>
			<c:out value="${rolsession}"></c:out>
			<c:out value="${hora}"></c:out>
		</p>
		<form action="../Logout">
		<p><input type="submit" value="CerrarSesion" ></p>
		</form>
		
		<input type=<%=(request.getRequestURI().endsWith("Menu.jsp")) ? "hidden" : "sumbit"  %> value="Volver" id="volver" onclick="window.history.go(-1)">
		
		



	</div>
</body>
</html>