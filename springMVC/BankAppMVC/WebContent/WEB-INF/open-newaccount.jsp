<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: black;
}

* {
	box-sizing: border-box;
}

/* Add padding to containers */
.container {
	padding: 16px;
	background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for the submit button */
.submitbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.submit:hover {
	opacity: 1;
}

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>
</head>
<body>
	<!-- Navbar -->
	<div class="w3-top">
		<div class="w3-bar w3-black w3-card">
			<a
				class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right"
				href="javascript:void(0)" onclick="myFunction()"
				title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a> <a
				href="index.html" class="w3-bar-item w3-button w3-padding-large">HOME</a>

			<a href="open-newaccount.html"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">OPEN
				NEW ACCOUNT</a> <a href="withdraw.html"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">WITH
				DRAW</a> <a href="deposit.html"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">DEPOSIT</a>
			<a href="fund-transfer.html"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">FUND
				TRANSFER</a> <a href="search-account.html"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">SEARCH
				ACCOUNT</a> <a href="check-balance.html"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">CHECK
				BALANCE</a> <a href="account-details.html"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">ACCOUNT
				DETAILS</a> <a href="delete-account.html"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">DELETE
				ACCOUNT</a> <a href="update-bankaccount.html"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">UPDATE
				BANK ACCOUNT</a> <a href="javascript:void(0)"
				class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i
				class="fa fa-search"></i></a>
		</div>
	</div>

	<form style="margin-top: 50px;" action="addNewBankAccount.do"
		method="post">
		<div class="container">
			<h1></h1>

			<hr>

			<label for="Customer Name"><b>Customer Name</b></label> <input
				type="text" name="Customer Name" required> <label
				for="Account Type"><b>Account Type</b></label><br> <select
				name="type">
				<option value="">--Select--</option>
				<option value="Saving">Saving</option>
				<option value="Current">Current</option>
			</select>
			<hr>

			<label for="Account Balance"><b>Account Balance</b></label> <input
				type="text" name="Account Balance" required>


			<hr>
			<p>
			<center>
				<BUTTON>
					<input type="submit" value="Open New Account">
				</BUTTON>
			</center>
		</div>

		<div class="container signin"></div>

	</form>


</body>
</html>