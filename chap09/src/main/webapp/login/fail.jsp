<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<p>로그인 실패...</p>
	
	<p>3초 후 메인으로 이동합니다...</p>
	
	<script>
		setTimeout(() => {
			location.href = '<%=request.getContextPath() %>/login/login.jsp';	
		}, 3000);
	</script>

</body>
</html>