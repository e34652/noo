<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String str = request.getParameter("곰곰문문");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
for(int i=1; i<=9; i++) {
%>
	<h1><%=str %> X <%=i %>=<%=i* Integer.parseInt(str)%></h1>
<%} %>
</body>
</html>