<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="F" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IStudent edit</title>
</head>
<body>
	<F:form action="update.html" modelAttribute="student" method="post">
		<F:input path="name"/>
		<F:input path="mark"/>
		<F:input path="major"/>
		<input type="submit" name="Cập nhật"/>
	</F:form>
</body>
</html>