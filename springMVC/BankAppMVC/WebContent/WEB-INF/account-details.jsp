<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!doctype html>
<html>
<head>
<title>ICICI</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/style.css">
</head>
<body style="background-color: white">
<!-- Navbar -->
<div class="w3-top">
        <div class="w3-bar w3-black w3-card">
          <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
          <a href="index.html" class="w3-bar-item w3-button w3-padding-large">HOME</a>
          <a href="open-newaccount.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">OPEN NEW ACCOUNT</a>
          <a href="withdraw.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">WITH DRAW</a>
           <a href="deposit.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">DEPOSIT</a>
           <a href="fund-transfer.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">FUND TRANSFER</a>
           <a href="search-account.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">SEARCH ACCOUNT</a> 
           <a href="check-balance.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CHECK BALANCE</a>
             <a href="account-details.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">ACCOUNT DETAILS</a>
             <a href="delete-account.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">DELETE ACCOUNT</a>
             <a href="update-bankaccount.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">UPDATE BANK ACCOUNT</a>
     
         
          <a href="javascript:void(0)" class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i class="fa fa-search"></i></a>
        </div>
      </div>

<form style="margin-top:80px;">
  <div class="container">
        <table class="table table-bordered">
                <thead>
                  <tr>
                    <th>Account Number</th>
                    <th>Name</th>
                    <th>Account Type</th>
                    <th>Balance</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>675439867</td>
                    <td>Doe</td>
                    <td>savings</td>
                    <td>5000</td>

                  </tr>
                  <tr>
                    <td>98465589</td>
                    <td>Moe</td>
                    <td>savings</td>
                    <td>900</td>
                  </tr>
                  <tr>
                    <td>87645321</td>
                    <td>Dooley</td>
                    <td>current</td>
                    <td>6934</td>
                  </tr>
                </tbody>
              </table>
  </div>
</form>

</body>
</html>