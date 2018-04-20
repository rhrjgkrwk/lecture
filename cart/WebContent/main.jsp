<%@page import="vo.CartVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="vo.ProductVO"%>
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
<style type="text/css">
h1 {
	text-align: center;
	font-family: fantasy;
}

div {
	display: inline;
	margin: 15px auto;
	width: 50%;
	padding: 10px;
	border: solid 1px lightgray;
	border-radius: 20px;
	text-align: center;
}

input {
	width: 30%;
}

p {
	text-align: center;
}

img {
	border-radius: 20px;
}
</style>
<script type="text/javascript">
	$('document').ready(function() {
		$('#pl').on('click', function() {
			location.href = "productlist.jsp";
		});
		$('#cart').on('click', function() {
			location.href = "cartview.jsp";
		});
		$('#buy').on('click', function() {
			location.href = "cartremove.jsp";
		});
	});
</script>
</head>
<body>
	<%
		if (session.getAttribute("productArray") == null) {
			HashMap<String, ProductVO> productArray = new HashMap<>();
			productArray.put("100", new ProductVO(100, "삼성TV", 150000, 10));
			productArray.put("101", new ProductVO(101, "LG TV", 250000, 10));
			productArray.put("102", new ProductVO(102, "김치", 5600, 100));
			productArray.put("103", new ProductVO(103, "사과", 3300, 90));
			productArray.put("104", new ProductVO(104, "소고기", 15000, 70));
			productArray.put("105", new ProductVO(105, "치킨", 13900, 100));
			productArray.put("106", new ProductVO(106, "햄버거", 7000, 65));
			productArray.put("107", new ProductVO(107, "삼계탕", 10000, 37));
			productArray.put("108", new ProductVO(108, "피자", 12000, 100));
			productArray.put("109", new ProductVO(109, "소세지", 7300, 1200));
			session.setAttribute("productArray", productArray); //메인에서 세션을 생성하고 시작하자.
		} 
		if (session.getAttribute("cartArray") == null) {
			session.setAttribute("cartArray", new HashMap<Integer, CartVO>());
		} 
	%>
	<h1>Welcome to Shopping Mall</h1>
	<div class="input-group">

		<input id="pl" type="button" class="btn btn-default"
			value="Product List"> <input id="cart" type="button"
			class="btn btn-default" value="Cart"> <input id="buy"
			type="button" class="btn btn-default" value="Buy"> <br>
		<br> <img alt="고양이" src="images/cat4.jpg" width="90%"> <br>
		<br>
		<p>오늘은 생필품을 세일하고 있습니다.</p>
	</div>
</body>
</html>