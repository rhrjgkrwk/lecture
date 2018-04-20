<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
<%
session.removeAttribute("pw");
session.removeAttribute("loginTime");
//session.invalidate();
%>
<jsp:forward page="0419sessionform.jsp"></jsp:forward>
</body>
</html>