<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title></title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		request.setAttribute("test", "test123abc가나다");
		//forward하기 이전에 set해야한다. forward 이후의 라인은 실행되지 않기 떔시롱.
		if(id.equals("admin")){ //관리자이면 admin페이지로
	%>
	<jsp:forward page="forwardadmin.jsp"/>
	<%
		}	
		else { //아니면 일반 유저 페이지로
	%>
	<jsp:forward page="forwardgeneraluser.jsp"/>
	<%
		}
	%>
</body>
</html>