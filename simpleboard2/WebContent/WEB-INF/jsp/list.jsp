<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.kia.board.*"%>
<%
	List<BoardVo> data = (List<BoardVo>) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<h1>리스트 화면</h1>
	<div>
		<a href="reg"><button>글등록</button></a>
	</div>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>날짜</th>
		</tr>
		<%
			if (data != null) {
				for (int i = 0; i < data.size(); i++) {
					BoardVo vo = data.get(i);
		%>
		<tr>
			<td><%=vo.getI_board()%></td>
			<td><a href="detail?i_board=<%=vo.getI_board()%>"><%=vo.getTitle()%></td>
			<td><%=vo.getRegdatetime()%></td>


			<%
				}
				}
			%>
		
	</table>
</body>
</html>