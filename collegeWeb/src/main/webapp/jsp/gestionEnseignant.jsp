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

<h1>Gestion des enseignants</h1>


<form:form modelAttribute="enseignant" action="/collegeWeb/admin/addEnseignant">



 <form:input path="nom" type="text" class="form-control form-control-lg" placeholder="nom"></form:input>
 <br>
  <br>
  <form:input path="prenom" type="text" class="form-control form-control-lg" placeholder="prenom"></form:input>
  <br>
   <br>
   <form:input path="mail" type="text" class="form-control form-control-lg" placeholder="mail"></form:input>
  <br>
   <br>
   <form:input path="tel" type="text" class="form-control form-control-lg" placeholder="tel"></form:input>
  <br>
   <br>
   <form:input path="datePriseFonction" type="text" class="form-control form-control-lg" placeholder="Date de prise de fonction (..../../..) "></form:input>
  
 <br>
 





Département: <form:select path="departement.idDepartement" items="${departements}"
itemValue="idDepartement" itemLabel="nomDepartement">
<option>Département</option>
</form:select>
 <br>
 
Matière: <form:select path="matiere.idMatiere" items="${matieres}"
itemValue="idMatiere" itemLabel="nom"></form:select>


<br>

<form:button type="submit" value="valider" >valider</form:button>

<a href="<c:url value="/j_spring_security_logout"/>" >logout</a>
</form:form>

</body>
</html>