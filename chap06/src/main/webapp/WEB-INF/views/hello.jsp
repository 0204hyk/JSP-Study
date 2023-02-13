<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="EUC-KR">
	<title>Hello</title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resource/css/hello.css" />
</head>
<body>
	
	<h1>Hello, ${name }</h1>
	
	<p>
		HTML(jsp 말고), CSS, Javascript, image 등의 자원들은
		서버로 요청을 보내 받아오는 정적 자원들이다.
	</p>
	
	<!-- 단, web.xml은 수정하지 말 것, @WebServlet도 금지 -->
	<a href="<%=request.getContextPath()%>/gugudan">구구단 보러가기</a> <br />
	
	<img width="300" src="https://cdnweb01.wikitree.co.kr/webdata/editor/202104/13/img_20210413170803_58348a47.webp" alt="펭귄" /> <br>
	<img class="fruit" width="300" src="<%=request.getContextPath() %>/resource/image/Apple.jpg" alt="사과" /> <br>
	<img class="fruit" width="300" src="<%=request.getContextPath() %>/resource/image/Lychee.jpg" alt="리치" /> <br>
	<img class="fruit" width="300" src="<%=request.getContextPath() %>/resource/image/Plum.jpg" alt="자두" /> <br>
	
	<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/hello.js"></script>
</body>
</html>