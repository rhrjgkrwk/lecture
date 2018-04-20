<%@page import="java.io.UnsupportedEncodingException"%>
<%@page import="java.net.URLDecoder"%>
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
	<%!private String getCookieValueByName(Cookie[] cookies, String name) throws UnsupportedEncodingException{
		String res = null;
		if (cookies == null) {
			return null;
		}
		for (Cookie ck : cookies)
			if (ck.getName().equals(name)){
				String result = URLDecoder.decode(ck.getValue(), "UTF-8");
				return result;
			}
		return null;
	}%>
	<%
	//클라이언트로부터 쿠키를 전송 받음.
	//동일 IP의 동일 브라우저 내에서 브라우저가 종료되기 전까지 공유된다.
	//저장 기간은 사용자가 임의로 설정할 수 있다.
	//(크롬의 경우 : 설정을 통해 IE 쿠키를 공유할 수 있음)
	Cookie cookies[] = request.getCookies();
// 	for(int i = 0; i<cookies.length; i++){
// 		out.println("<h3>"+cookies[i].getName() + " "+ cookies[i].getValue()+"</h3>");
// 	}
	out.println(cookies[0].getValue());
%>
	<h3>


		<%
if(getCookieValueByName(cookies, "cookieid")!=null){
	%>
		<%=getCookieValueByName(cookies, "cookieid") %>
		님 환영합니다. 최근 접속시간은
		<%=getCookieValueByName(cookies, "loginTime") %>
		입니다.
		<%
}
%>

	</h3>
</body>
</html>