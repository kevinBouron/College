<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suivi Etudiant</title>
</head>
<body>

<form:form modelAttribute="etudiant" action="/collegeWeb/user/moyenneG">


 Etudiants: <form:select path="idPersonne" items="${etudiants}"
itemValue="idPersonne" itemLabel="nom"> 
 </form:select> 
 <br>

<button type="submit" class="btn"> Valider </button>

</form:form>
<br>

Moyenne générale: <output>${note}</output>

</body>




</html>