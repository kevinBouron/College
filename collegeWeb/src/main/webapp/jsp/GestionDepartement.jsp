<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
	integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' 
crossorigin='anonymous'>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Gestion Département</title>
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-light bg-light ">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
    <a class="navbar-brand" ><h1>Gestion des départements</h1></a>
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="/collegeWeb/admin/home"><h2 style="color:grey"><i class="fas fa-home"></i>Accueil</h2> <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">										</a>
      </li>
      <li class="nav-item" >
        <a class="nav-link" href="#"><h2 style="color:grey">Se déconnecter </h2> <span class="sr-only">(current)</span></a>
      </li>
    </ul>
   
  </div>
</nav>




	<br>
	<form:form modelAttribute="departement"
		action="/collegeWeb/admin/adddDepartement">

<form:input path="idDepartement" type="hidden" />
Nom du département: <form:input path="nomDepartement" type="text" />
		<br>
College: <form:select path="college.idCollege" items="${colleges}"
			itemValue="idCollege" itemLabel="idCollege"></form:select>
		<br>
Enseignant : <form:select path="responsable.idPersonne"
			items="${enseignants}" itemValue="idPersonne" itemLabel="nom"></form:select>
		<br>
		<button type="submit" class="btn">Valider</button>

	</form:form>
	<br>

	<table class="table" style="width: 600px">
		<thead>
			<tr>
				<th width="60" align="center">Nom Département</th>
				<th width="60" align="center">Enseignant Responsable</th>
				<th width="60" align="center">College</th>
				<th width="60" align="center">Edit/Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${departements}" var="d">
				<tr>

					<td width="60" align="center">${d.nomDepartement}</td>

					<td width="60" align="center">${d.responsable.idPersonne}</td>
					<td width="60" align="center">${d.college.nom}</td>

					<td width="60" align="left"><a
						href="editDep?idDep=${d.idDepartement}"> edit </a><a
						href="suppDep?id=${d.idDepartement}">delete</a></td>




				</tr>
			</c:forEach>
		</tbody>
	</table>

	




</body>
</html>