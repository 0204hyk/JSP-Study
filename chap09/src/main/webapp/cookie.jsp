<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>쿠키</title>
</head>
<body>

	<h3># Cookie란 무엇인가</h3>
	
	<ul>
		<li>최초로는 서버에서 생성하여 웹 브라우저에 저장하는 데이터</li>
		<li>쿠키는 name/value 형태로 되어 있다.</li>
		<li>해당 쿠키가 적용될 범위를 path를 통해 설정할 수 있다.</li>
		<li>해당 쿠키의 수명을 maxAge를 통해 설정할 수 있다.</li>
		<li>maxAge의 단위는 초이고, 0이면 삭제, -1이면 세션을 의미한다.</li>
	</ul>

	<h3># Cookie의사용 순서</h3>
	
	<ol>
		<li>최초로 서버에서 새로운 쿠키를 생성하고 응답에 함께 실어 보낸다.</li>
		<li>웹 브라우저에 도착한 응답에 쿠키가 있다면 웹 브라우저에 저장된다.</li>
		<li>쿠키가 살아있는 동안은 해당 서버로 보내는 모든 요청에 해당 쿠키가 포함된다.</li>
	</ol>
	
	쿠키는 아이디 저장 여부, 팝업 하루동안 뜨지 않기, 검색어 자동 저장 등에 사용할 수 있다. <br>
	
	<button onclick="location.href='<%=request.getContextPath()%>/cookie/add'">쿠키 추가하러 가기</button>
	<button onclick="location.href='<%=request.getContextPath()%>/cookie/usage'">쿠키 값 활용하기</button>
	
</body>
</html>