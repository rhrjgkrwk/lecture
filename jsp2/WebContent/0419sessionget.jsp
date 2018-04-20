<%@page import="java.util.Date"%>
<%@page import="java.io.UnsupportedEncodingException"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript">
	$('document').ready(function(){
		$('#logout').on('click',function(){
			location.href="0419sessionremove.jsp";	
			//JS에서 페이지 이동시 location 내장객체의 href 속성을 변경하면 된다.
		});
	});
	
</script>
<title>Session GET</title>
</head>
<body>
	<h1>세션 정보를 가져와보자.</h1>
	<%
		if(session.getAttribute("id")!=null && session.getAttribute("pw")!=null&& session.getAttribute("loginTime")!=null){
	%>
	<%=request.getAttribute("id") %>님이 접속했고<br>
	비밀번호는 <%=session.getAttribute("pw") %>입니다.<br>
	로그인 시간은 <%=session.getAttribute("loginTime") %>이다.<br>
	<a href="0419sessionremove.jsp">Log out</a><br>
	<input id="logout" type="button" value="Log out"><br>
	<%
		} else {
	%>
<!-- 	로그인 정보 없음.<br> -->
<!-- 	<a href="0419sessionform.html">로그인</a> -->
	<jsp:forward page="0419sessionform.html"></jsp:forward>
	<%
		}
	%>
	
	
</body>
</html>