<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="College" action="/collegeWeb/">

<!-- <button type="button" class="btn"><a href="<c:url value="/admin"/ > gestion étudiants</a></button>
 -->

<a href="<c:url value="/admin/"/>" >gestion matières</a><br>
<a href="<c:url value="/admin/"/>" >gestion départements</a><br>
<a href="<c:url value="/admin/"/>" >gestion enseignants</a><br>
<a href="<c:url value="/admin/"/>" >gestion salles</a><br>




<button type="button" class="btn"><a href="<c:url value="/j_spring_security_logout"/ > logout </a></button>


</form:form>
</body>
</html>