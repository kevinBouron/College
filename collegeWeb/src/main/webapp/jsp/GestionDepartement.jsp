<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Gestion Département</title>
</head>
<body>

<h2> Assigner un enseignant responsable à un département</h2>
<form:form modelAttribute="college" action="/">

College: <form:select path="College.idCollege" items="${colleges}" itemValue="idCollege" itemLabel="siteInternet"></form:select> <br>
Enseignant : <form:select path="Enseignant.idPersonne" items="${enseignants}" itemValue="idPersonne" itemLabel="nom; prenom; mail; tel"></form:select>

<form:button type="submit" value="valider" > Valider </form:button>
<br>

<table class="table table-bordered" style="width: 600px">
         <tr>
           <th>Nom Département </th>
           <th>Enseignant Responsable</th>
           <th>Edit/Delete</th>
         </tr>
         <c:forEach items="${departements}" var="d">
         <tr>
           <td width="60" align="center">${d.nomDepartement}</td>
           <td width="60" align="center">${d.Responsable}</td>
           
           <td width="60" align="center"><a href="">Edit</a>/<a href="">Delete</a></td>
         </tr>
      </c:forEach>
    </table>

<a href="<c:url value="/j_spring_security_logout"/>" >Se déconnecter </a>
</body>
</html>