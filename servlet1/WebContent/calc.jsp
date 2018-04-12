<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//java 소스를 쓸 것이다.
		//http://localhost:9090/servlet1/calc.jsp 로 호출한다.
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		
		//브라우저 출력시 out이라는 이름의 내장객체를 사용하면 된다.
		out.println("<h1>1부터 100까지의 합 : "+sum+"</h1>");
	%>
</body>
</html>