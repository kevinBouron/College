<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


<title>Suivi coll�ge</title>
</head>
<body>

<form:form modelAttribute="departement" action="/">
College: <form:select path="Departement.idDepartement" items="${departements}" itemValue="idDepartement" itemLabel="nomDepartement"></form:select> <br>
Calculer la moyenne g�n�rale du d�partement : <br>
<output type="text" value="${}"></output> <br>

<button type="button" class="btn">Valider</button>
</form:form>


Afficher moyenne d'une mati�re:
<form:form modelAttribute="note" action="/">
Mati�re: <form:select path="Noter.idMatiere" items="${departements}" itemValue="idDepartement" itemLabel="nomDepartement"></form:select> <br>
<output type="text" value="${}"></output> <br>



<button type="button" class="btn"><a href="<c:url value="/j_spring_security_logout"/ > <i class="fas fa-sign-out-alt"></i>Se d�connecter </a></button>




</body>
</html>