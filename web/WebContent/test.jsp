<%@page contentType="text/html;charset=Windows-31J"%>
<html>
<body>
	<h1>転送されたよ</h1>
	sessionから送られたNameは「<%=session.getAttribute("name")%>」です。
	<br> requestから送られたAgeは「<%=request.getAttribute("age")%>」です。
</body>
</html>