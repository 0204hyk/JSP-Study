<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>피자</title>
</head>
<body>

	<h3># 피자로 연습하기</h3>
	
	<p>다음을 만드시오. (테이블도 만드시오, 예전에 썼던 폼 참조)</p>
	
	<ul>
		<li><a href="<%=request.getContextPath() %>/pizza/order/orderList">이전 주문 내역 보기 (DB의 피자 주문 테이블을 select)</a></li>
		<li><a href="<%=request.getContextPath() %>/pizza/order/orderForm">새 주문 만들기 (DB의 피자 주문 테이블에 insert)</a></li>
	</ul>
	

</body>
</html>