<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertStudent" method="post">
		Student Id : <input type="text" name="sId" id="sId"><br>
		Student Name : <input type="text" name="sName" id="sName"><br>
		Student email : <input type="text" name="email" id="email"><br>
		UserName : <input type="text" name="userName" id="userName"><br>
		Password : <input type="text" name="password" id="password"><br>
		course : <input type="text" name="course" id="course"><br>
		Date Of Birth : <input type="date" name="dob" id="dob"><br>
		<button type="submit" name="btn" id="insert">Add New Student</button>
	</form>
</body>
</html>