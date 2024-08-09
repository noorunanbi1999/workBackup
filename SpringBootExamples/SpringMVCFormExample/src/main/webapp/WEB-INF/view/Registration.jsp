<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-885">
<title>Registration</title>
</head>
<body>
	<div align="center">
	<form:form action="register" method="post" modelAttribute="userform">
	User Name :<form:input path="username"/>
	Password :<form:input path="password"/>
	Profession :<form:select path ="profession" items="${professionList}"/>
	<input type="submit" value ="Register"/>
	</form:form>
</div>
</body>
</html>