<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Matière</title>
</head>
<body>

<form:form modelAttribute="matiere" action="/">

Matière: <form:select path="Matiere.idMatiere" items="${matieres}" itemValue="idMatiere" itemLabel="nom"></form:select> <br>
Salle: <form:select path="Salle.idSalle" items="${salles}" itemValue="idSalle" itemLabel="Salle"></form:select> <br>
Enseignant : <form:select path="Enseignant.idPersonne" items="${enseignants}" itemValue="idPersonne" itemLabel="Enseignant"></form:select>

<button type="button" class="btn"> Valider </button>


</body>
</html>