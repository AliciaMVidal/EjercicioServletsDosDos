<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ page session="true"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta categoria</title>
</head>
<body>
<%@ include file="cabecera.jsp" %>  
<h3>Hacer alta de categoria</h3>
	<form  action="../Categoria">
		<span class="subtitle">Nombre:</span> 
		<br> 
		<input type="text" name="categorianombre" value="">
		<br>
		<span class="subtitle">Descripcion:</span>
		<br>
		<input type="text" name="categoriadescripcion" value="">
		<br>
		<input type="submit" value=Crear >
	</form>

</body>
</html>