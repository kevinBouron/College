<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="College" action="/collegeWeb/">

<a href="<c:url value="/admin/"/>" >gestion étudiants</a><br>
<a href="<c:url value="/admin/"/>" >gestion matières</a><br>
<a href="<c:url value="/admin/"/>" >gestion départements</a><br>
<a href="<c:url value="/admin/"/>" >gestion enseignants</a><br>
<a href="<c:url value="/admin/"/>" >gestion salles</a><br>




<a href="<c:url value="/j_spring_security_logout"/>" >logout</a>


</form:form>
</body>
</html>