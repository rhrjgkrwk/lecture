<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<link rel="stylesheet" href="../css/bootstrap.css">
<script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1><%= exception.getMessage() %></h1>
	<br>
	<%@ include file="bookcommon.jsp"%>
</body>
</html>