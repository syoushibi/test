<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500px">
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>成绩</td>
		</tr>
		<c:forEach items="${list }" var="stu">
			<tr>
				<td>${stu.id}</td>
				<td>${stu.name}</td>
				<td>${stu.age}</td>
				<td>${stu.score}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>