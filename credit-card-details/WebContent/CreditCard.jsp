<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CreditCardDetails</title>
</head>
<body>
	card number: ${cardnumber}
	<br> holder name: ${holdername}
	<br> expire month: ${expiremonth}
	<br> expire year: ${expireyear}
	<br> cvv: ${cvv}
	<br>

</body>
</html>