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
	<jsp:include page="include2.jsp">
		<jsp:param value="메롱" name="id"/>
		<jsp:param value="<%=check%>" name="condition"/>
	</jsp:include>
	</h1>
</body>
</html>