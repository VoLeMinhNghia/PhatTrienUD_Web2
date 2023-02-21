<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<title>Demo 1</title>
</head>
<body>
	<%
	  // Lấy giá trị chiều cao và cân nặng từ form
	  double height = Double.parseDouble(request.getParameter("height"));
	  double weight = Double.parseDouble(request.getParameter("weight"));
	
	  // Tính chỉ số BMI
	  double bmi = weight / (height * height);
	
	  // Hiển thị kết quả BMI
	  out.println("Chỉ số BMI của bạn là: " + String.valueOf(bmi));
	%>
</body>
</html>