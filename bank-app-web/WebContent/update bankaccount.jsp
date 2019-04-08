<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>

	<form action="updateAccountDetails.do" method="post">

		accountId <input type="number" name="Account Id"
			value="${accounts.accountId}" readonly="readonly"><br>

		customer name <input type="text" name="Customer Name"
			value="${accounts.accountHolderName}"><br> <br>
		account type <select name="type">

			<option>${accounts.accountType}</option>

			<option value="saving">Saving </option>

			<option value="current">Current </option>

		</select> <br> <br>account balance <input type="text"
			name="Balance" value="${accounts.accountBalance}"
			readonly="readonly"><br> <br>
		<input type="submit" value="update">

	</form>


</body>
</html>