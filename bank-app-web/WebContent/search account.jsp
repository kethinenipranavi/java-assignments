<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-bordered">
				<thead>
					<tr>
						<th>Account Id</th>
						<th>Name</th>
						<th>Account Type</th>
						<th>Balance</th>
					</tr>
				</thead>
				<tbody>
						<tr>
							<td>${accounts.accountId}</td>
							<td>${accounts.accountHolderName}</td>
							<td>${accounts.accountType}</td>
							<td>${accounts.accountBalance}</td>
						</tr>

				</tbody>
			</table>
			
</body>
</html>