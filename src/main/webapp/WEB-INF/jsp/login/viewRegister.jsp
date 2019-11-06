<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link href="/resources/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form:form method="post" action="/register/submit"
		modelAttribute="register">
		<fieldset id="registerFieldset">
			<h3 id="titleRegister">Register</h3>
			<form:label for="name" path="name" id="labelName">Name*: </form:label>
			<form:input type="text" name="name" path="name" id="inputName" /><br>
			<form:label for="lastname" path="lastname" id="labelLastname">Last
				name*: </form:label>
			<form:input type="text" id="inputLastname" name="lastname"
				path="lastname" />
			<br>
			<form:label for="username" path="username" id="labelUsername">Username*: </form:label>
			<form:input type="text" name="username" path="username" id="inputUsername" /><br>
			<form:label for="password" path="password" id="labelPassword">Password*:
			</form:label>
			<form:input type="text" id="inputPassword" name="password" path="password"/><br>
			<form:label for="confirmPassword" path="confirmPassword" id="labelConfirmPassword">Confirm<br> Password*: </form:label>
			<form:input type="text" id="inputConfirmPassword" name="confirmPassword" path="confirmPassword"/>
			<br>
			<form:label for="email" path="email" id="labelEmail">E-Mail*: </form:label>
			<form:input type="text" name="email" path="email" id="inputEmail" /><br> <br>
			<input type="submit" id="submitButtonRegister" value="Submit" />
			<button id="cancelButtonRegister">Cancel</button>
		</fieldset>
	</form:form>
</body>
</html>