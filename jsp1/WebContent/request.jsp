<%@page import="java.io.FileWriter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.Date, java.text.SimpleDateFormat"%>
<%@ page import="java.io.*"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//get /post 동일동작
		out.println("요청방식=" + request.getMethod());
		if (request.getMethod().equals("POST")) {
			//post처리
			request.setCharacterEncoding("utf-8");
			out.println(request.getParameter("a"));
		} else if (request.getMethod().equals("GET")) {
			//GET처리
			out.println(request.getParameter("a"));

		}
	%>
	<%
		//서버로그 기록한다: 영구적 파일 저장
		// 클라이언트ip, 날짜시간: 요청파일명 출력
		String clientIP = request.getRemoteAddr();
		String fileName = request.getRequestURI();
		Date now = new Date(); //import해줘야함
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년도 MM월 dd일 HH시 mm분 ss초");
		//run configurations-Tomcat v8.0 Server at localhost-Argument 탭--Djava.net.preferIPv4Stack=true 추가
		String now2 = sd.format(now);
	%>
	<%=clientIP + " 컴퓨터가 " + fileName + " 에 접근한 시각은 " + now2 + " 입니다.<br>"%>

	<%
		//1. c:\\log.txt 파일 없으면 생성 후 저장 
		// 있으면 기존내용 유지후 추가해서 저장-> filewriter(이름,true)
		//2.FileWriter 객체
		FileWriter fw = new FileWriter("c:\\log.txt", true);
		fw.write(clientIP + " 컴퓨터가 " + fileName + "에 접근한 시각은 " + now2 + " 입니다.\n");
		fw.close();
	%>

	<%=request.getHeader("user-agent")%>
	<%
		//response.sendRedirect("http://www.google.com");
		//위에거 다 상관없이 ↑이거를 응답객체로 설정해줘
		//나쁜일에 사용가능 헤헤^^ ex)은행 사이트 들어가자마자 보안카드번호 전체입력창이 계속나옴
	%>
</body>
</html>