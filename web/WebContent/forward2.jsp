<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="destination2.jsp">
		<jsp:param value="ABCDE" name="param2" />
	</jsp:forward>
</body>
</html>