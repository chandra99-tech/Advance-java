<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ${message} </h1>
	<form action="/MyStudentProject/login/validateUser" method="post">
		User Name : <input type="text" name="uname" id="un" placeholder="Enter Your User Name" required="required"><br>
		Password : <input type="password" name="pass" id="ps" placeholder="Enter 8 Characters Password" required="required"> <br>
		<button type="submit" name="login" id="login" value="login">Log In </button>
	</form>
	<a href="#">Don't Have An Account? Create New Account</a> <br>
	<a href="#">Forgot password?</a>
</body>
</html>