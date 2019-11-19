<%--
	*표현언어(Expression Language:EL)
	톰캑에서 제공하기 때문에 따로 설정할 필요 없습니다.
	JSP 스크립트 대신하여 속성 값들을 좀 더 편리학 출력하기 위해 제공되는언어입니다.
	형식) ${ }
	
	표현식 태그
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
		<h3>EL예제</h3>
			<table>
			    <tr>이름</tr>
			    <td><input name="name"></td>
				<tr>
					<td>취미</td>
					<td><input type="checkbox" name="hobby" id="hobby1"
						value="독서">독서 <input type="checkbox" name="hobby"
						id="hobby2" value="놀기">놀기</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="입력"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>