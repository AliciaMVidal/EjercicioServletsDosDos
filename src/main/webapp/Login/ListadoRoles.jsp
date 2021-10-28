<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, modelo.Rol, modelo.RolDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado roles</title>
<%@ include file="cabecera.jsp" %>  
</head>
<body>
	<%!RolDAO roldao = new RolDAO();%>
	<%!HashMap<Integer, Rol> listadoRol = roldao.getTodosRolQuery();%>

	<%
	pageContext.setAttribute("listadoRol", listadoRol);
	%>

	<p>Lista de roles</p>

	<form>
		<table>
			<tr>
				<th>id</th>
				<th>rol</th>
			</tr>

			<c:forEach var="rol" items="${listadoRol}">
				<tr>
					<td>${rol.key}</td>
					<td>${rol.value}</td>
				</tr>
			</c:forEach>

		</table>
	</form>
</body>
</html>