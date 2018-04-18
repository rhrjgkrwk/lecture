<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="java.io.*"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>파일을 읽어오자.</title>
</head>
<body>
	<%
	FileReader fr = new FileReader("c://log.txt");
	Scanner sc = new Scanner(fr);
	while(sc.hasNextLine()){
		out.println(sc.nextLine()+"<br>");
	}
	sc.close();
	%>
</body>
</html>