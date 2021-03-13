<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<link rel="stylesheet" href="Views/bootstrap.css" />

<script type="text/javascript" src="js/validation.js"></script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col">

				<h2>Registration form</h2>

				<form name="form" action="registerServlet" method="post" onsubmit="return validateForm()">
					<table align="center">
						<tr>
							<td>User name</td>
							<td>
								<input type="text" id="userName" name="userName" onchange="emptyCheck('userName', userName)" 
								class="form-control"/>
								
							</td>
						</tr>
						<tr>
							<td>Email</td>
							<td>
								<input type="text" id="email" name="email" onchange="emailValidation('email', email)" 
								onchange="emptyCheck('email', email)" class="form-control"/>
								
							</td>
						</tr>
						<tr>
							<td>NIC</td>
							<td>
								<input type="text" id="nic" name="nic" onchange="nicValidation('nic', nic)" 
								onchange="emptyCheck('nic', nic)" onclick="nicValidation('nic', nic)" class="form-control"/>
								
							</td>
						</tr>
						<tr>
							<td>Mobile number</td>
							<td>
								<input type="text" id="mobile" name="mobile" onchange="mobileValidation('mobile', mobile)" 
								onchange="emptyCheck('mobile', mobile)" class="form-control"/>
								
							</td>
						</tr>
						<tr>
							<td>Password</td>
							<td>
								<input type="password" id="password" name="password" onchange="emptyCheck('password', password)" 
								onchange="emptyCheck('password', password)" class="form-control"/>
								
							</td>
						</tr>
						<tr>
							<td>Confirm Password</td>
							<td>
								<input type="password" id="confirmPassword" name="confirmPassword" 
								onchange="emptyCheck('confirmPassword', confirmPassword)" 
								onchange="emptyCheck('confirmPassword', confirmPassword)" class="form-control"/>
								
							</td>
						</tr>
					
						<tr>
							<td></td>
							<td>
								<input type="submit" value="Register" class="btn btn-primary">
								<input type="reset" value="Reset" class="btn btn-secondary">
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>