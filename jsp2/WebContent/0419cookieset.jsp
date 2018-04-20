<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
<%
//쿠키 하나당 변수 하나가 저장된다.
String id = request.getParameter("id");
System.out.println(id);
String pw = request.getParameter("pw");

Cookie loginTime = new Cookie("loginTime",new Date().toLocaleString());
//ID 쿠키만 24시간 유지되도록 설정해보자.
loginTime.setMaxAge(60*60*24*30); //초단위임.

//쿠키를 클라이언트에 전송(response)한다.
//클라이언트에 응답할 때 쿠키도 넣어줘.

if(id!=null && !id.equals("")) {
	response.addCookie(new Cookie("cookieid",URLEncoder.encode(id, "UTF-8")));
	response.addCookie(loginTime);
	out.print("쿠키전송완료");/*  */
}
// response.addCookie(cookie2);


%>
<%-- <jsp:forward page="0419cookieget.jsp"></jsp:forward> --%>
</body>
</html>