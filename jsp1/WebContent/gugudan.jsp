<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>구구단</title>
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<style type="text/css">
td {
	text-align: center;
	padding: 10px;
}

body {
	text-align: center;
}

table {
	margin: 10px auto;
}
</style>

<script type="text/javascript">
	$('document').ready(function(){
		function x(){
			$('.tmp').css("border","solid 1px rgb("+Math.random()*255+","+Math.random()*255+","+Math.random()*255+")");
			setTimeout(x, 200);
		}	
		x();
	});
</script>

</head>
<body>
	<h1>구구단을 외자!</h1>
	<table class="tmp">
		<%
			for (int dan = 1; dan <= 9; dan++) {
		%>
		<tr class="tmp">
			<%
				for (int i = 2; i <= 9; i++) {
			%>
			<td class="tmp"><%=i + " X " + dan + " = " + (dan * i)%></td>
			<%
				}
			%>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>