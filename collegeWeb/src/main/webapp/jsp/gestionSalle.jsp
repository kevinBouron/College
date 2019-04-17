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

<form:form modelAttribute="Salle" action="/collegeWeb/">

 
Matières: <form:select path="Matiere.idMatiere" items="${matieres}"
itemValue="idMatiere" itemLabel="nom"></form:select>
 <br>
 
 <form:button type="submit" value="valider" >valider</form:button>

<a href="<c:url value="/j_spring_security_logout"/>" >logout</a>
</form:form>


</body>
</html>