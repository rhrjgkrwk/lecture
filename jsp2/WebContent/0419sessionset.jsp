<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<meta charset=UTF-8>
<title>Session SET</title>
</head>
<body>
	<%
		if (request.getParameter("id") != null) {
			session.setAttribute("id", URLEncoder.encode(request.getParameter("id"),"EUC-KR"));
			session.setAttribute("pw", request.getParameter("pw"));
			session.setAttribute("loginTime", new Date().toLocaleString());
			out.print("세션이 저장되었다.");
	%>
	<h4>

		<%=session.getAttribute("id")%>
		로그인하였다.
		<a href="0419sessionget.jsp">GET SESSION</a>
	</h4>
	<%
		} else {
	%>
	<jsp:forward page="0419sessionform.html"></jsp:forward>
	<%
		}
	%>
	
	
	
</body>
</html>