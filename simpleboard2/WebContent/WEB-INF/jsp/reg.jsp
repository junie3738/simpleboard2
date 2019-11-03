<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글등록</title>
</head>
<body>
	<form action="reg" method="post">
		<div>
			제목 : <input type="text" name="title">
		</div>
		<div>
			내용 :
			<textarea name="content"></textarea>
		</div>
		<div>
			<input type="submit" value="글등록"> <br>
			<input type="reset" value="초기화">
		</div>


	</form>

</body>
</html>