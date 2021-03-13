let nameInvalid = true;
let nicInvalid = true;
let emailInvalid = true;
let mobileInvalid = true;
let passwordInvalid = true;

function emptyCheck(name, id) {
	var inputValue = document.getElementById(name);
	if (inputValue.value == "" || inputValue.value == null || inputValue.value == " ") {
		id.style.border="1px solid red";
		nameInvalid = true;
	} else {
		id.style.backgroundColor = "";
	}
}

function nicValidation(nic, id) {
	var regExpression = /^[0-9]{9}[vVxX]$/;
	if (!regExpression.test(nic)) {
		id.style.border="1px solid red";
		alert("Invalid NIC");
		nicInvalid = true;
	} else {
		value.style.backgroundColor = "";
	}
}

function emailValidation(email, id) {
	var regExpression = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
	if (!regExpression.test(email.value)) {
		id.style.border="1px solid red";
		alert("Invalid E-mail");
		emailInvalid = true;
	} else 
		value.style.backgroundColor = "";
	
}

function mobileValidation(phone, id) {
	var regExpression = /^\d{10}$/;
	if (!regExpression.test(phone)) {
		id.style.border="1px solid red";
		alert("Invalid Mobile number");
		mobileInvalid = true;
	} else {
		value.style.backgroundColor = "";
	}
}

function validateForm() {
	var email = document.getElementById('email');
	var nic = document.getElementById('nic');
	var mobile = document.getElementById('mobile');
	var password = document.getElementById('password');
	var confirmPassword = document.getElementById('confirmPassword');
	
	emailValidation(email.value, email)
	nicValidation(nic.value, nic)
	mobileValidation(mobile.value, mobile)
	
	if(password.value != confirmPassword.value){
		alert("Passwords not matching!");
		passwordInvalid = true;	
	}
	
	if(nameInvalid == true || nicInvalid == true || emailInvalid == true || mobileInvalid == true || passwordInvalid == true){
		window.location = 'registrationPage.jsp';
	}
}

