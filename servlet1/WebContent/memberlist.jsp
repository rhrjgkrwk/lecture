<%@page import="vo.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="dao.UserDao"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
/* table { */
/* 	margin: 40px auto; */
/* 	text-align: center; */
/* 	width: 50%; */
/* 	border: solid 1px lightgray; */
/* 	border-radius: 7px; */
/* 	padding: 15px; */
/* } */

input{
	width: 100%;
}


h1 {
	font-family: fantasy;
	font-size: 50px;
	text-align: center;
	text-decoration: bold;
}

th{
	text-align: center;
}

div {
	margin: 10px auto;
	text-align: center;
	width: 80%;
}
</style>
</head>
<body>
	<%
		UserDao.getConn();
		UserDao ud = new UserDao();
		ArrayList<User> ul = ud.getAllMember();
	%>
	<h1>Member List</h1>
	
	<div>
	<input type="button" class="btn btn-success" value="add member" onclick="location.href='user.html'">
	<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Email</th>
		</tr>
		<%
			for (User u : ul) {
				String p = "<tr>";
				p+="<td>"+u.getId()+"</td>";
				p+="<td>"+u.getName()+"</td>";
				p+="<td>"+u.getPhone()+"</td>";
				p+="<td>"+u.getEmail()+"</td>";
				p+="</tr>";
				out.print(p);
			}
			%>
	</table>
	
	</div>
	
</body>
</html>










