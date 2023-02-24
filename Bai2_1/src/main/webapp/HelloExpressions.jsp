<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Hello MinhMinLe</h1>
		<%
		  Date currentDate = new Date();
		  String currentDateStr = currentDate.toString();
		%>

		Ngày hiện tại là: <%= currentDateStr %>
		<%= 2023 - 2002 %>
		<%="<br> <b> Hôm nay tôi học JSP </b>" %>
	</center>
</body>
</html>