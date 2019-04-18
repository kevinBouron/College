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

<form:form modelAttribute="enseignant" action="/collegeWeb/admin/addEnseignant">


nom: <form:input path="nom" type="text"/> <br>
prenom: <form:input path="prenom" type="text"/> <br>
mail: <form:input path="mail" type="text"/> <br>
tel: <form:input path="tel" type="text"/> <br>
Date de prise de fonction: <form:input path="datePriseFonction" type="text"/> <br>
 
Département: <form:select path="departement.idDepartement" items="${departements}"
itemValue="idDepartement" itemLabel="nomDepartement"></form:select>
 <br>
 
Matière: <form:select path="matiere.idMatiere" items="${matieres}"
itemValue="idMatiere" itemLabel="nom"></form:select>
 <br>



<form:button type="submit" value="valider" >valider</form:button>

<a href="<c:url value="/j_spring_security_logout"/>" >logout</a>
</form:form>

</body>
</html>