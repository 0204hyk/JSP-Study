<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>${type} 확인 절차</title>
</head>
<body>

	<c:choose>
		<c:when test="${type == 'modify'}">
			${type} 비밀번호를 입력해주세요. <br>
			<form action="./modify" method="POST">
				<input type="password" name="user_pw" />
				<!-- POST방식에서는 url 뒤에 값을 붙여서 보낼 수 없기 때문에 
					 새로운 요청을 보낼 때 히든으로 숨겨서 보내야 한다. -->
				<input type="hidden" name="board_id" value="${board_id}" /> <!-- 어트리뷰트에서 꺼내기 -->
				<input type="submit" value="confirm "/>
			</form>
		</c:when>
		<c:when test="${type == 'delete'}">
			${type} 비밀번호를 입력해주세요. <br>
			<form action="./delete" method="POST">
				<input type="password" name="user_pw" />
				<input type="hidden" name="board_id" value="${param.board_id}" /> <!-- 파라미터에서 꺼내기 -->
				<input type="submit" value="confirm "/>
			</form>
		</c:when>
		<c:otherwise>
			잘못된 접근입니다.
			<a href="./list">목록으로 돌아가기</a>
		</c:otherwise>
	</c:choose>
	
</body>
</html>