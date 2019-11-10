<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Overview Project</title>
<link href="/resources/style.css" rel="stylesheet" type="text/css">
</head>
<body>
		<div class="menu">
		<ul>
			<li><a href="../projectAdmin">Overview</a></li>
			<li><a href="../project">Projekt Hinzufügen</a></li>
			<li><a href="../project/role">Rolen ändern</a></li>
			<li id="menuLogout"><a href="../login">Log out</a></li>
		</ul>
	</div>
	<fieldset id="overviewProjectFieldset">
		<h3 id="titleOverviewProjects">Overview Projekte</h3>
		<jsp:include page="../error/error.jsp" />
		<table>
			<tr>
				<th>Projektname</th>
				<th>Release Date</th>
				<th>Beschreibung</th>
			</tr>
			<c:forEach items="${projects}" var="project" varStatus="loop">
				<tr>
					<td>${project.getProjectName()}</td>
					<td>${project.getReleaseDate()}</td>
					<td>${project.getDescription()}</td>
				</tr>
			</c:forEach>
		</table>
		<form action="/project">
			<button id="buttonRedirect">Add Project</button>
		</form>
	</fieldset>
</body>
</html>