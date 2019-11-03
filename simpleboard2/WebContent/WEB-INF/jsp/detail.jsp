<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.kia.board.*"%>
<%
	BoardVo vo = (BoardVo) request.getAttribute("vo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세내용</title>
</head>
<body>
	<div>
		제목:
		<%=vo.getTitle()%></div>
	<div>
		날짜:
		<%=vo.getRegdatetime()%></div>
	<div>
		내용:
		<%=vo.getContent()%></div>
</body>
</html>