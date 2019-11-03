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
	<%
		if (vo != null) {
	%>
	<div>
		<button>수정</button>
		<form method="post">
			<input type="hidden" name="i_board" value="<%=vo.getI_board()%>">
			<input type="submit" value="삭제">

		</form>
	</div>

	<div>
		제목:
		<%=vo.getTitle()%></div>
	<div>
		날짜:
		<%=vo.getRegdatetime()%></div>
	<div>
		내용:
		<%=vo.getContent()%></div>
	<%
		} else {
	%>
	<div>ㅇㅔ러가 발생하였습니다.</div>
	<%
		}
	%>
</body>
</html>