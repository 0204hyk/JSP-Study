<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 화면</title>
</head>
<body>	
	
	<h1>Log-In</h1>
	
	<div>
		<form action="/chap04/quiz/login" style="display: inline;" method="POST">
		ID <input type="text" id="mem-id" name="mem-id"> <br>
		PW <input type="password" id="password" name="password"> <br>
		<input type="submit" value="로그인">
		</form>
		<form action="./join.jsp" style="display: inline;">
			<input type="submit" value="회원가입">
		</form>
	</div>
				
</body>
</html>