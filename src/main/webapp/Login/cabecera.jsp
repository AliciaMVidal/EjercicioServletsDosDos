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
	<div>

		<p>cabecera</p>
		<p>
			<c:out value="${sessionScope.nombresesion}"/>
			<c:out value="${sessionScope.hora}"/>

		</p>




	</div>
</body>
</html>