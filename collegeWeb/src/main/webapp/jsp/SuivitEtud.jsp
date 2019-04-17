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


Etudiants: <form:select path="Etudiant.idPersonne" items="${etudiants}"
itemValue="idPersonne" itemLabel="Etudiant"></form:select>
 <br>

<form:button type="submit" value="valider" >ok</form:button>
</form:form>
<output>${MoyenneG}</output>
</body>
</html>