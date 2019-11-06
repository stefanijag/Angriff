<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New Project</title>
<link href="/resources/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="../menu/menu.jsp"/>
	<form:form method="post" action="/project/add"
		modelAttribute="project">
		<fieldset id="createProjectFieldset">
			<h3 id="titleCreateProject">Add New Project</h3>
			<form:label for="projectName" path="projectName" id="labelProjectName">Project Name*: </form:label>
			<form:input type="text" name="projectName" path="projectName" id="inputProjectName" /><br>
			<form:label for="releaseDate" path="releaseDate" id="labelReleaseDate">Release Date*: </form:label>
			<form:input type="text" id="inputReleaseDate" name="releaseDate"
				path="releaseDate" />
			<br>
			<form:label for="description" path="description" id="labelDescription">Description*: </form:label>
			<form:input type="text" name="description" path="description" id="inputDescription" /><br>		
			<input type="submit" id="submitButtonCreateProject" value="Submit" />
			<button id="cancelButtonCreateProject">Cancel</button>
		</fieldset>
	</form:form>
</body>
</html>