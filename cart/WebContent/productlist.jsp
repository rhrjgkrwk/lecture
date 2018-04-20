<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
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
<title></title>
<script type="text/javascript">
	$('document').ready(function() {
		$('input:checkbox').on('click', function() {
			var tmp = $(this).val();
			if ($(this).prop("checked") == false) {
				$('input[name=\'' + tmp + '\']').attr("disabled", "disabled");
			} else
				$('input[name=\'' + tmp + '\']').removeAttr("disabled");
		});
		$('#main').on('click', function() {
			location.href = "main.jsp";
		});
	});
</script>
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

.b1 {
	width: 40%;
}
</style>

</head>
<body>

	<h1>Product List</h1>
	<div>
		<%
			HashMap<String, ProductVO> productArray = (HashMap<String, ProductVO>) session.getAttribute("productArray");
		%>
		<form action="cartsave.jsp">
			<table class="table">
				<tr>
					<th>Pic</th>
					<th>Name</th>
					<th>Price</th>
					<th>Balance</th>
					<th>check</th>
					<th>Qty</th>
				</tr>
				<%
					String imgList[] = { "bono.jpg", "cat.jpg", "cat1.jpg", "cat2.jpg", "cat3.jpg", "cat4.jpg", "cat5.jpg" };
					int i = 0;
					for (ProductVO product : productArray.values()) {
				%>
				<tr>
					<td><img alt="사진" width="80px" height="80px;"
						src="<%="images/" + imgList[(i++) % 7]%>"></td>

					<td><%=product.getName()%></td>

					<td><%=product.getPrice() + "원"%></td>

					<td><%=product.getBalance() + "개"%></td>

					<td><input type="checkbox" class="" name="selected"
						value="<%=product.getCode()%>>"></td>

					<td><input type="text" class="form-control" placeholder="Qty"
						disabled="disabled" name="<%=product.getCode()%>>"></td>
				</tr>
				<%
					}
				%>
				
			</table>
				<input type="submit" value="Go to cart" class="btn btn-danger">
				<input id="main" type="button" value="Go to Main" class="btn btn-danger">
		</form>
	</div>
</body>
</html>