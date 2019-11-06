<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<br>
	<c:forEach items="${errors}" var="error" varStatus="loop">
		<p style="color: red">${error.getDefaultMessage()}</p>
	</c:forEach>
	<c:if test="${not empty error}">
		<p style="color: red">${error}</p>
	</c:if>

	<c:if test="${not empty success}">
		<p style="color: green">${success}</p>
	</c:if>
</body>
</html>