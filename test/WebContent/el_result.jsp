<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
%>
<html>
<head>
<title>EL ���尴ü ��� ����</title>
</head>
<body>
	<h3> �Ѿ�� �̸���: ${param.name }</h3>
	<h3> �Ѿ�� ��̴�
	${paramValues.hobby[0] },
	${paramValues.hobby[1] },
	</h3>
</body>
</html>