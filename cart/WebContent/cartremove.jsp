<%@page import="vo.CartVO"%>
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
<title>Insert title here</title>
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
	text-align: center;
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

#b {
	width: 100%;
}
</style>
<script type="text/javascript">
	$('document').ready(function() {
		$('#b').on('click', function() {
			location.href = "main.jsp";
		});
		$('input:radio').on('click',function(){
			$('#res').html($('input:radio:checked').val()+"로 결제가 진행된다......")
		});
	});
</script>
</head>
<body>
	<h1>Buy</h1>
	<%
		HashMap<String, ProductVO> productArray = (HashMap<String, ProductVO>) session.getAttribute("productArray");
		HashMap<Integer, CartVO> cartArray = (HashMap<Integer, CartVO>) session.getAttribute("cartArray");
	%>

	<div>
		<table class="table">
			<tr>
				<th>Pic</th>
				<th>Name</th>
				<th>Price</th>
				<th>amount</th>
				<th>total</th>
			</tr>
			<%
				String imgList[] = { "bono.jpg", "cat.jpg", "cat1.jpg", "cat2.jpg", "cat3.jpg", "cat4.jpg", "cat5.jpg" };
				int i = 0;
				int total = 0;
				if (cartArray!=null && cartArray.size() != 0) {
					
					for (Integer code : cartArray.keySet()) {
			%>
			<tr>
				<td><img alt="사진" width="80px" height="80px;"
					src="<%= "images/" + imgList[(i++) % 7] %>" ></td>

				<td><%=productArray.get(String.valueOf(code)).getName()%></td>

				<td><%=productArray.get(String.valueOf(code)).getPrice() + "원"%></td>

				<td><%=cartArray.get(code).getAmount() + "개"%></td>
				<% 
				int tmp = cartArray.get(code).getAmount()*productArray.get(String.valueOf(code)).getPrice();
				total += tmp;
				%>
				<td><%=tmp + "원"%></td>
				
			</tr>
			
			
			<%
					}
				} else { //장바구니가 비어있으면
			%>
			<tr>
				<td colspan="5">장바구니가 비었다.</td>
			</tr>
			<%
				}
			%>
			<tr><td colspan="5">TOTAL : <%=total + "원" %></td></tr>

		</table>
		<br>
		<div>
			현금 : <input type="radio" name="payment" value="Cash">		
			카드 : <input type="radio" name="payment" value="Card">
		</div>
		<br>
		
		<h3 id="res"></h3>
		
		
		<input id="b" type="button" value="Go to Main"
			class="btn btn-danger">
	</div>
</body>
</html>