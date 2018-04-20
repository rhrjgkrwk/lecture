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
<%
	ProductVO vo = new ProductVO();
	vo.setCode(1000);
	vo.setName("samsung TV");
	vo.setPrice(150000);
	vo.setBalance(50);
%>
<h1>오늘 제품 등록 현황</h1>
<%=vo.getCode() %><br>
<%=vo.getName() %><br>
<%=vo.getPrice() %><br>
<%=vo.getBalance() %><br>

<jsp:useBean id="vo1" class="vo.ProductVO" />
<jsp:setProperty property="code" name="vo1" value="1001" />
<jsp:setProperty property="name" name="vo1" value="LG에어컨" />
<jsp:setProperty property="price" name="vo1" value="111000000" />
<jsp:setProperty property="balance" name="vo1" value="20" />
<br>
<jsp:getProperty property="code" name="vo1" /><br>
<jsp:getProperty property="name" name="vo1" /><br>
<jsp:getProperty property="price" name="vo1" /><br>
<jsp:getProperty property="balance" name="vo1" /><br>


<h1>Scope test</h1>
<br>
<jsp:useBean id="vo5" class="vo.ProductVO" scope="request"/>	
<jsp:getProperty property="code" name="vo5" /><br>
<jsp:getProperty property="name" name="vo5" /><br>
<jsp:getProperty property="price" name="vo5" /><br>
<jsp:getProperty property="balance" name="vo5" /><br>



</body>
</html>