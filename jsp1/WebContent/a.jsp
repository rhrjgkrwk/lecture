<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>

<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
여기는 a.jsp이다. 넘 졸리당.
<br>
<%@ include file="common.jsp"%>
<br>
<%= "a : "+ request.getRequestURI() %>
</body>
</html>