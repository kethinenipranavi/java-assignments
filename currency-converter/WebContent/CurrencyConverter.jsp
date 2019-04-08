<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Currency Converter</title>
</head>
<body>
	<h2>Currency Converter</h2>
	<table border="2">
		<tr>
			<th>Dollors</th>
			<th>Rupees</th>
		</tr>
		<c:forEach var="k" begin="1" end="50" step="1">
			<tr>
				<td>${k}</td>
				<td>${k*45}</td>

			</tr>
		</c:forEach>

	</table>
</body>
</html>