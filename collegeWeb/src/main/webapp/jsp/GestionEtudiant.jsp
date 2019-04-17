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
<form:form modelAttribute="etudiant" action="/collegeWeb/">

nom: <form:input path="nom" type="text"/> <br>
prenom: <form:input path="prenom" type="text"/> <br>
mail: <form:input path="mail" type="text"/> <br>
tel: <form:input path="tel" type="text"/> <br>
Année entrée: <form:input path="anneEntree" type="text"/> <br>


<form:button type="submit" value="valider" >ok</form:button>
</form:form>
</body>
</html>