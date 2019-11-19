<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
%>
<html>
<head>
<title>EL 내장객체 사용 예제</title>
</head>
<body>
	<h3> 넘어온 이름은: ${param.name }</h3>
	<h3> 넘어온 취미는
	${paramValues.hobby[0] },
	${paramValues.hobby[1] },
	</h3>
</body>
</html>