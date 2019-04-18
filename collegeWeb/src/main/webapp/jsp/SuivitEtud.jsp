<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suivi Etudiant</title>
</head>
<body>

<form:form modelAttribute="etudiant" action="/collegeWeb/">


Etudiants: <form:select path="idPersonne" items="${etudiants}"
itemValue="idPersonne" itemLabel="Etudiant"></form:select>
 <br>

<button type="button" class="btn"> Valider </button>

</form:form>
<output>${MoyenneG}</output>
</body>



<button type="button" class="btn"><a href="<c:url value="/j_spring_security_logout"/ > <i class="fas fa-sign-out-alt"></i> Se déconnecter </a></button>
</html>