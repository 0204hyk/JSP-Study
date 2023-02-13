<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>

	<div>
		<form action="/chap04/quiz/join" style="display: inline;" method="POST">
		ID <input type="text" id="join-id" name="join-id"> <br>
		PW <input type="password" id="join-pw" name="join-pw"> <br>
		<input type="submit" value="가입하기">
		</form>
		<button id="cancel" onclick="location.href='/chap04/quiz/login.jsp'">취소</button>
	</div>
	
</body>
</html>