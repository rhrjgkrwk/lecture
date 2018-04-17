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

	<%=	application.getAttribute("i")%>
<!-- 	application 내장객체를 통해 servlet/jsp간 변수를 공유할 수 있다.  -->
<!-- 	공유변수 지정은 application.setAttribute() -->
<!-- 	공유변수 가져오기는 application.getAttribute() 를 사용한다. -->
<!-- 	공유변수는 전부Object 객체가 되어 리턴된다. -->
	
<%-- 	<%
	 	String str = (String)application.getAttribute("str");
	%> --%>

	<%
		int count = (int)application.getAttribute("count");
		out.println(count);
		application.setAttribute("count", count+1);
	
	
	%>
	
	</h1>

</body>
</html>