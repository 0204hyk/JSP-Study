<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
	<title>주문 내역</title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resource/css/orderList.css" />
</head>
<body>
	
	<div id="frame">
		<h1 id="title">주문 내역</h1>
		
		<table border="2">
			<th>이름</th>
			<th>도로명 주소</th>
			<th>도시</th>
			<th>이메일</th>
			<th>핸드폰</th>
			<th>크러스트</th>
			<th>사이즈</th>
			<th>토핑</th>
			<th>요구사항</th>
		
			<c:forEach items="${pastOrders}" var="pastOrder">
				<tr>
					<td>${pastOrder.name}</td>
					<td>${pastOrder.streetAddress}</td>
					<td>${pastOrder.city}</td>
					<td>${pastOrder.email}</td>
					<td>${pastOrder.phone}</td>
					<td>${pastOrder.crust}</td>
					<td>${pastOrder.size}</td>
					<td>${pastOrder.topping}</td>
					<td>${pastOrder.instruction}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
		
</body>
</html>