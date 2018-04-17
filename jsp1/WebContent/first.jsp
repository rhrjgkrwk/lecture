<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	errorPage="error.jsp"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
	<h1>
		<%!int member = 1000;//Firt_jsp class의 멤버변수 선언.%>
		<%!public void testMethod() { //메서드 선언 
		System.out.println("user.jsp testMethod 실행중이다.");
		System.out.println(member);
	}%>
		<%
			//jsp_Service 메서드 
			//자바문장 - JspWriter out이 내장되어있음.
			int sum = 0;
			for (int i = 1; i <= 100; i++)
				sum += i;
			out.println("answer : " + sum);
			testMethod();
		%>
		<%=member%>
		<%
			//exception을 발생시켜보자.
			String tmp = null;
			tmp.toLowerCase();
		%>
	</h1>
</body>
</html>