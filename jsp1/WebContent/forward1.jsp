<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Include1</title>
<style type="text/css">
h1 {
	text-align: center;
}
</style>
</head>

<body>
	<h1>
	
	
	
	<%
		String id = request.getParameter("id");
		String check = "메로롱";
		request.setAttribute("condition1", check);
	%>
	<%=  id+" 회원 로그인했다." %>
	<br>
	<jsp:forward page="forward2.jsp"/> 
	<!-- 	forward 실행하면 forward1.jsp의 내용은 브라우저에 출력되지 않는다. -->
	
	</h1>
</body>
</html>