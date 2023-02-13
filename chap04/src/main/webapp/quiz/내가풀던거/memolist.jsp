<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>저장된 메모 리스트</title>
</head>
<body>
	
	<h3>저장된 메모 리스트</h3>

 	<textarea cols="30" rows="10" readonly><%=request.getParameter("memo") %></textarea>
		
</body>
</html>