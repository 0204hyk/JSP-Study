<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String name = request.getParameter("name");
	String streetAddress = request.getParameter("street-address");
	String city = request.getParameter("city");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String crust = request.getParameter("crust");
	String size = request.getParameter("size");
	String[] toppings = request.getParameterValues("toppings");
	String instructions = request.getParameter("instructions");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Order Summary</title>
<link rel="stylesheet" href="./quizcss2.css">
</head>
<body>

	<div id="frame">
		<h1>Order Summary</h1>
			<div>
				<h3 class="subtitle" id="subtitle1">Deliver to</h3>
				<div class="info">
					<%=name %> <br>
					<%=streetAddress %> <br>
					<%=city %> <br>
					<%=email %> <br>
					<%=phone %> <br>
				</div>
			</div>
			<div>
				<h3 class="subtitle" id="subtitle2">Order</h3>
				<div class="info">
					<span>Crust: </span><%=crust %> <br>
					<span>Size: </span><%=size %> <br>
					<span>Topping(s): </span><%=java.util.Arrays.toString(toppings) %> <br>
					<span>Instructions: </span><%=instructions %>
				</div>
			</div>
	</div>
</body>
</html>