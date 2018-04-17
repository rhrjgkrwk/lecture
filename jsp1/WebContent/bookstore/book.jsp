<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="amounterror.jsp"%>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.css">
<script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
<meta charset=UTF-8>
<title>주문 내역</title>

<style type="text/css">



div{
	width: 60%;
	margin: 20px auto;
}
table {
	text-align: center;
}

h1 {
	text-align: center;
	font-family: fantasy;
}
</style>

</head>
<body>
	<h1>Order List</h1>
	
	<%!public boolean isNum(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}%>

	<div>
	<table class="table">
		<%
			String[] bookList = { "java", "Oracle", "jquery", "Servlet", "Spring" };
			int[] priceList = { 66000, 124000, 2929000, 35000, 2000 };
			int sum = 0;
			for (int i = 0; i < bookList.length; i++) {
				String tmp = request.getParameter(bookList[i]);
				if(tmp==null) continue;
				if (isNum(tmp) && Integer.parseInt(tmp) > 0) {
					int num = Integer.parseInt(tmp);
		%>

		<tr>
			<td><%=bookList[i]%></td>
			<td><%=num + "권"%></td>
		</tr>

		
		<%
			sum += (num * priceList[i]);
				} else {
					//비정상
					throw new Exception("자연수만 입력해라");
				}
			}
		%>

		<tr>
			<td><%="total"%></td>
			<td><%=sum + "원"%></td>
		</tr>

		<tr>
			<td><%="Address"%></td>
			<td><%=request.getParameter("addr")%></td>
		</tr>

		<tr>
			<td><%="Phone"%></td>
			<td><%=request.getParameter("areacode") + "-" + request.getParameter("phone")%>
			</td>
		</tr>

	</table>
	<%@ include file="bookcommon.jsp"%>	
	</div>
</body>
</html>