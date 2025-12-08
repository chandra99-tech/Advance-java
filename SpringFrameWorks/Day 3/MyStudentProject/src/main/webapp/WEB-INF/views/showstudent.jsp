<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<table border='2'>
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Email</th>
			<th>Username</th>
			<th>Password</th>
			<th>Course</th>
			<th>Date Of Birth</th>
			<th>action</th>
		</tr>
		<c:forEach var="stud" items="${slist}">
		<tr>
			<td>${stud.sId}</td>
			<td>${stud.sName}</td>
			<td>${stud.email}</td>
			<td>${stud.userName}</td>
			<td>${stud.password}</td>
			<td>${stud.course}</td>
			<td>${stud.dob}</td>
			<td><a href="deletstudent/${stud.sId}">delete</a>/<a href="editstudent/${stud.sId}">edit</a></td>
		</tr>
		</c:forEach>
	</table>
	<a href="addstudent">Add new Student</a>
	<br>
	<a href="${pageContext.request.contextPath}/login/logout">Log Out</a>
</body>
</html>
