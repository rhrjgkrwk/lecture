<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
	<h1>이 과정은 
	<%= application.getInitParameter("title") %>
	<br>
	종료일은 
	<%= application.getInitParameter("enddate") %>
<!-- 	web.xml 의 context-param을 불러오는 방법 -->
	</h1>
</body>
</html>