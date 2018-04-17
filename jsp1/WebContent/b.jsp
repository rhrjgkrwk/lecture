<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
<h1>
	여기는 b.jsp<br>
	<%@ include file="a.jsp" %>
	<br>
	오홍 싱기방기
	<br>
	<%= "b : "+ request.getRequestURI() %>
	<br>
	<%= "b : "+ request.getRemoteAddr() %>
</h1>
</body>
</html>