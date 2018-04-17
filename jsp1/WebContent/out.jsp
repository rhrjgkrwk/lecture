<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  buffer="4kb" flush%>
    <!-- buffer="8kb" 
     -->
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 웹서버 자주 등장하는 오류번호=오류코드
404: 서버내부경로, 파일없다.
(파일명 확인)
405: http 요청방식이 어긋날 때
get->doPost   post->doGet 업떠ㅠ매서드 지원하지않는방식으로 호출했을때
500: 서버오류. 서블릿이나 jsp소스 예외발생.
심각한 오류닷 -->

<%-- <% java.io.PrintWriter out =null; %> --%>
<%=out.getBufferSize() %> <!-- 아웃 내장객체에 있다! -->   
<%  //요청했던 클라이언트 브라우저에 전송
//out: tomcat서버 jsp 서버내부 임시 버퍼 공간에 저장. 따라서 모든걸 다하고 전송하는게 나음.
//얘↓ 얼마든지 취소할수있다.
out.println("<h1>출력내용</h1>"); 
//out.clearBuffer();  //만약 이게 없다면 출력내용이라는게 잘 보임. 버퍼에 있는걸 출력안하겠다.
out.flush(); //버퍼 저장되어 있는것 만큼만 브라우저 출력 후 비운다.
%>
<%=out.getRemaining() %> <!-- 버퍼공간 얼마나 남았니? -->
</body>
</html>