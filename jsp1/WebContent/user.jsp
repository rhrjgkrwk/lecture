<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.UserDao"%>
<%@page import="vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	
	%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<meta charset="UTF-8">
<title>깔깔깔깔깔</title>
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
	<h1>Member List</h1>

	<div>
		
		
		<input type="button" class="btn btn-success" value="add member"
			onclick="location.href='user.html'">
		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Phone</th>
				<th>Email</th>
			</tr>
			<%
				
				
				
			
				//회원정보 읽음
				String id = request.getParameter("id");
				String pw = request.getParameter("pw");
				String name = request.getParameter("name");
				String phone = request.getParameter("phone");
				String email = request.getParameter("email");
				User user = new User(id, name, pw, phone, email);

				//UserDao 사용하여 데이터 INSERT
				UserDao.getConn();
				UserDao dao = new UserDao();
				dao.insertUser(user);
				ArrayList<User> ul = dao.getAllMember();
				//응답 결과 출력.
				
				for (User u : ul) {
					String p = "<tr>";
					p += "<td>" + u.getId() + "</td>";
					p += "<td>" + u.getName() + "</td>";
					p += "<td>" + u.getPhone() + "</td>";
					p += "<td>" + u.getEmail() + "</td>";
					p += "</tr>";
					out.print(p);
				}
				
			%>
			
			
		</table>
		<%= new Date() %>
	</div>
	
</body>
</html>