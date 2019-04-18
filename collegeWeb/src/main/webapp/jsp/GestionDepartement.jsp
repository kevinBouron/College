<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Gestion Département</title>
</head>
<body>

<h2> Assigner un enseignant responsable à un département</h2>
<form:form modelAttribute="departement" action="/collegeWeb/admin/adddDepartement">

nom: <form:input path="nomDepartement" type="text"/> <br>
College: <form:select path="college.idCollege" items="${colleges}" itemValue="idCollege" itemLabel="idCollege"></form:select> <br>
Enseignant : <form:select path="Responsable.idPersonne" items="${enseignants}" itemValue="idPersonne" itemLabel="nom"></form:select>

<form:button type="submit" value="valider" > Valider </form:button>
</form:form>
<br>

<table class="table" style="width: 600px">
 <thead>
         <tr>
           <th>Nom Département </th>
           <th>Enseignant Responsable</th>
           <th>Edit/Delete</th>
         </tr>
       </thead>
         <tbody>
         
         <tr>
         <c:forEach items="${departements}" var="d">
           <td width="60" align="center">${d.nomDepartement}</td>
           <td width="60" align="center">${d.Responsable}</td>
           
           <td width="60" align="center"><a href="">Edit</a>/<a href="">Delete</a></td>
            </c:forEach>
         </tr>
     
       </tbody>
    </table>

<button type="button" class="btn"><a href="<c:url value="/j_spring_security_logout"/>" >Se déconnecter </a></button>

</body>
</html>