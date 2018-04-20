<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Include2</title>
</head>
<body>
	<% 	Date date = new Date(); 
		//response.setContentType("text/html;charset=utf-8");
	%>
	<%= date.toLocaleString() %>
	<br>
	<%= request.getParameter("id") + " " + request.getParameter("condition") %>
	<br>
	<%= request.getAttribute("condition1")%>
	
</body>
</html>