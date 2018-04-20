<%@page import="vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
<h1>오늘 제품 등록 현황</h1>

<h3>value attr 이용</h3>
<jsp:useBean id="vo1" class="vo.ProductVO" />
<jsp:setProperty property="code" name="vo1" value="<%= Integer.parseInt(request.getParameter(\"code\"))%>" />
<jsp:setProperty property="name" name="vo1" value="<%= request.getParameter(\"name\")%>" />
<jsp:setProperty property="price" name="vo1" value="<%= Integer.parseInt(request.getParameter(\"price\"))%>" />
<jsp:setProperty property="balance" name="vo1" value="<%= Integer.parseInt(request.getParameter(\"balance\"))%>" />
<br>
<jsp:getProperty property="code" name="vo1" /><br>
<jsp:getProperty property="name" name="vo1" /><br>
<jsp:getProperty property="price" name="vo1" /><br>
<jsp:getProperty property="balance" name="vo1" /><br>

<h3>param attr 이용</h3>
<jsp:useBean id="vo2" class="vo.ProductVO" />
<jsp:setProperty property="code" name="vo2" param="code"/>
<jsp:setProperty property="name" name="vo2" param="name"/>
<jsp:setProperty property="price" name="vo2" param="price"/>
<jsp:setProperty property="balance" name="vo2" param="balance"/>
<br>
<jsp:getProperty property="code" name="vo2" /><br>
<jsp:getProperty property="name" name="vo2" /><br>
<jsp:getProperty property="price" name="vo2" /><br>
<jsp:getProperty property="balance" name="vo2" /><br>


<h3>모두 생략</h3>
<!-- 파라미터 name과 property가 일치하면 자동으로 값을 받아온다. -->
<!-- 다르면 null이 나오니깐 이름을 잘 맞춰야한다. -->
<jsp:useBean id="vo3" class="vo.ProductVO" />
<jsp:setProperty property="code" name="vo3" />
<jsp:setProperty property="name" name="vo3" />
<jsp:setProperty property="price" name="vo3" />
<jsp:setProperty property="balance" name="vo3" />
<br>
<jsp:getProperty property="code" name="vo3" /><br>
<jsp:getProperty property="name" name="vo3" /><br>
<jsp:getProperty property="price" name="vo3" /><br>
<jsp:getProperty property="balance" name="vo3" /><br>



<h3>더 생략</h3>
<jsp:useBean id="vo4" class="vo.ProductVO" scope="application" />
<!-- application 내장객체 안에 vo4라는객체가 있으면 그걸 쓰고 아니면 새로 만들어라 -->

<jsp:setProperty property="*" name="vo4" /> 
<!-- 일치하는 이름을 가진 모든 값들을 가져와서 자동으로 매핑점해주  -->
<br>
<jsp:getProperty property="code" name="vo4" /><br>
<jsp:getProperty property="name" name="vo4" /><br>
<jsp:getProperty property="price" name="vo4" /><br>
<jsp:getProperty property="balance" name="vo4" /><br>



<h3>scope 사용해보기</h3>
<!-- 자바빈 객체가 저장될 영역을 지정. page, request, session, application 중 하나를 값으로 갖는다. 기본값은 page -->

<jsp:useBean id="vo5" class="vo.ProductVO" scope="request"/>
<!-- scope이 request이면 인스턴스를 새로 생성하는 것이 아니라 기존에 생성된 vo5라는 인스턴스가 있는지 먼저 확인 후 없으면 생성한다. -->
<jsp:setProperty property="*" name="vo5" /> 
<!-- 일치하는 이름을 가진 모든 값들을 가져와서 자동으로 매핑점해주  -->
<br>

<jsp:forward page="0419beans1.jsp"></jsp:forward>


</body>
</html>