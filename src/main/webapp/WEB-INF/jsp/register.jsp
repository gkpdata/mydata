<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student admission form</h1>
<form:form action="save" method="post" modelAttribute="bean">
Roll no. :<br />
<form:input path="roll"/><br />
Student name :<br />
<form:input path="sname"/><br />
Course :<br />
<form:input path="course"/><br />
Fee :<br />
<form:input path="fee"/><br />
<input type="submit" value="Submit">
</form:form>
</body>
</html>