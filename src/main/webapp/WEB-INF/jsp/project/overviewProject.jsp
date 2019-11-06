<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Overview Project</title>
<link href="/resources/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="../menu/menu.jsp" />
	<fieldset id="overviewProjectFieldset">
		<h3 id="titleOverviewProjects">Overview Projects</h3>
		<table>
			<tr>
				<th>Project Name</th>
				<th>Release Date</th>
				<th>Description</th>
			</tr>
			<c:forEach items="${projects}" var="project" varStatus="loop">
				<tr>
					<td>${project.getProjectName()}</td>
					<td>${project.getReleaseDate()}</td>
					<td>${project.getDescription()}</td>
				</tr>
			</c:forEach>
		</table>
		<form action="project">
			<button id="buttonRedirect">Add Project</button>
		</form>
	</fieldset>
</body>
</html>