<%@page import="vo.CartVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vo.ProductVO"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<meta charset=UTF-8>
<title>Cart</title>
<style type="text/css">
h1 {
	text-align: center;
	font-family: fantasy;
}

div {
	width: 60%;
	margin: 15px auto;
	padding: 10px;
	border: solid 1px lightgray;
	border-radius: 10px;
}

p {
	text-align: center;
}

img {
	border-radius: 10px;
}

th, td, tr {
	text-align: center;
	vertical-align: middle;
}

table {
	text-align: center;
	width: 100%;
	vertical-align: middle;
}
</style>
</head>
<body>
	<%
		//selected=삼성TV>&selected=LG+TV>&LG+TV>=1
		HashMap<String, ProductVO> productArray = (HashMap<String, ProductVO>) session.getAttribute("productArray");
		HashMap<Integer, CartVO> cartArray = (HashMap<Integer, CartVO>) session.getAttribute("cartArray");
		if (request.getParameterValues("selected") != null) { // 장바구니에 추가할 것들이 있으면
			//선택된 것들 모음.
			String[] tmp = request.getParameterValues("selected");
			for (String str : tmp) {
				String restr = str.substring(0, str.length()-1);
				int code = Integer.parseInt(restr);
				int amount = Integer.parseInt(request.getParameter(str));
				
// 				System.out.println(restr);
// 				System.out.println(code);
// 				System.out.println(str);
// 				System.out.println(request.getParameter(str));
				
				if (cartArray.containsKey(code)) { //장바구니에 이미 담겨있는 상품이면
					//amount++;
					cartArray.get(code).setAmount(cartArray.get(code).getAmount() + amount);
					//session.setAttribute("cartArray", cartArray);
					//남은 수량 조절
					productArray.get(restr).setBalance(productArray.get(restr).getBalance() - amount);
					//session.setAttribute("productArray", productArray);
				} else { //아니면 새로 추가.
								//cart에 추가
					cartArray.put(code, new CartVO(code, amount));
					//session.setAttribute("cartArray", cartArray.put(code, new CartVO(code, amount)));
					//남은 수량 조절
					productArray.get(restr).setBalance(productArray.get(restr).getBalance() - amount);
					session.setAttribute("productArray", productArray);
				}
			}
		}
	%>
	<jsp:forward page="cartview.jsp"></jsp:forward>
</body>
</html>