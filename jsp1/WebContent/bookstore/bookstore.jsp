<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.css">
<script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
<meta charset=UTF-8>
<title>cart</title>
<style type="text/css">
h1 {
	text-align: center;
	font-family: fantasy;
}

table {
	width: 60%;
	margin: 20px auto;
	text-align: center;
}

form {
	width: 60%;
	margin: 20px auto;
	text-align: center
}

th, td {
	text-align: center;
}

.left {
	text-align: left;
}

.right {
	text-align: right;
}

input[type='submit'] {
	width: 100%;
}
</style>

<script type="text/javascript">
	$('document').ready(function() {
		$('input:checkbox').on('click', function() {
			var tmp = $(this).val();

			if ($(this).prop("checked") == false) {
				$('.' + tmp).attr("disabled", "disabled");
			} else
				$('.' + tmp).removeAttr("disabled");
		});

	});
</script>

</head>

<body>
	<h1>CART</h1>
	<form action="book.jsp">
		<table class="table table-striped">
			<tr>
				<th>Book name</th>
				<th class="left"></th>
				<th>Quantity</th>
			</tr>
			<%
				String[] bookList = { "java", "Oracle", "jquery", "Servlet", "Spring" };
				for (int i = 0; i < bookList.length; i++) {
			%>
			<tr>
				<td><%=bookList[i]%></td>

				<td><input type="checkbox" name="chk" value="<%=bookList[i]%>"></td>

				<td><input class="form-control <%=bookList[i]%>"
					name="<%=bookList[i]%>" type="text"
					placeholder="Enter the Quantity" disabled="disabled"></td>
			</tr>
			<%
				}
			%>
		</table>
		<table class="table">
			<tr>
				<td colspan="3"><input class="form-control" name="addr"
					type="text" placeholder="Enter Address"></td>
			</tr>
			<tr>
				<td><select name="areacode" class="form-control">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="019">019</option>
				</select></td>
				<td colspan="2"><input class="form-control" name="phone"
					type="text" placeholder="Enter phone number"></td>
			</tr>

			<tr>
				<td colspan="3">
					<input class="btn btn-danger" type="submit" value="purchase">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>