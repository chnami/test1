<%--
	*ǥ�����(Expression Language:EL)
	��Ĵ���� �����ϱ� ������ ���� ������ �ʿ� �����ϴ�.
	JSP ��ũ��Ʈ ����Ͽ� �Ӽ� ������ �� �� ���� ����ϱ� ���� �����Ǵ¾���Դϴ�.
	����) ${ }
	
	ǥ���� �±�
	1. <
 --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="el_result.jsp" method="post">
		<h3>EL����</h3>
			<table>
			    <tr>�̸�</tr>
			    <td><input name="name"></td>
				<tr>
					<td>���</td>
					<td><input type="checkbox" name="hobby" id="hobby1"
						value="����">���� <input type="checkbox" name="hobby"
						id="hobby2" value="���">���</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="�Է�"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>