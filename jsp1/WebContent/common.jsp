<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.text.SimpleDateFormat, java.util.Date"
    %>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
	<%= "오늘의 날씨정보는 맑음" %>
	
	<% 
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 M월 d일");
	%>
	<%="오늘은 "+sdf.format(now)+"입니다." %>
	
	<br>
	<%= "common : "+ request.getRequestURI() %>
</body>
</html>