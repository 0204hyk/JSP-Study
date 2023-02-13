<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>메인 화면</title>
</head>
<body>

	<h3>메모장</h3>
	
	<div>
		<form action="/chap04/quiz/memo" method="POST">
		<textarea name="memo" cols="30" rows="10" required></textarea> <br>
		<input type="submit" value="저장하기" id="save">
		</form>
	</div>
	
	<script>
		const save = document.getElementById("save");
		
		save.addEventListener('click', () => {
			alert('저장완료');
		});
	</script>
	
</body>
</html>