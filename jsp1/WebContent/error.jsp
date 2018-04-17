<!-- 오류전담 처리 page -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true" 
    %>

<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
<%System.out.println(exception);%>
<h1>서버 오류!!</h1>
</body>
</html>