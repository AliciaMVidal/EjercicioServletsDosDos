<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page session="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>

</head>
<body>
<%@ include file="cabecera.jsp" %>  

	<form>
		<p>
			<button type="submit" formaction="Admin/AltaRol.jsp">Alta de nuevo
				rol</button>
		</p>
		<br>
	</form>
	<form>
		<p>
			<button type="submit" formaction="ListadoRoles.jsp">Listado
				de roles</button>
		</p>
		<br>
	</form>
	<form>
		<p>
			<button type="submit" formaction="Admin/AltaCategoria.jsp">Crear nueva categoria</button>
		</p>
		<br>
	</form>
		<form>
		<p>
			<button type="submit" formaction="ListadoCategorias.jsp">Listado
				de categorias</button>
		</p>
		<br>
	</form>
</body>
</html>