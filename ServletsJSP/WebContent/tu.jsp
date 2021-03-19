<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP to display Kathmandu,Nepal 10 times</title>
</head>
<body>
<%
for(int i = 1;i<=10; i++){
	out.print("Kathmandu,Nepal<br>");
}
%>
</body>
</html>