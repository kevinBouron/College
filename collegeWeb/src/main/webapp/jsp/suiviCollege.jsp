<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<head>
<meta charset="ISO-8859-1">
<title>Gestion collège</title>
</head>
<body>

<form:form modelAttribute="departement" action="/">
College: <form:select path="Departement.idDepartement" items="${departements}" itemValue="idDepartement" itemLabel="nomDepartement"></form:select> <br>
Calculer la moyenne générale du département : <br>
<output type="text" value="${ }"></output> <br>
<form:button type="submit" value="valider" > Valider </form:button>


<a href="<c:url value="/j_spring_security_logout"/>" >Se déconnecter </a>

</form:form>
</body>
</html>