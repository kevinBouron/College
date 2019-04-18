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
  <meta name='viewport' content='width=device-width, initial-scale=1'>
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' 
crossorigin='anonymous'>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' 
crossorigin='anonymous'>
<title>Insert title here</title>
</head>
<body>
<table>

<form:form modelAttribute="College" action="/collegeWeb/admin/home">

<button style='font-size:24px'><a href="<c:url value="/admin/GestionSalles" >gestion salles</a> <i class='far fa-building'></i></button><br>

<button style='font-size:24px'><a href="<c:url value="/admin/GestionMatiere"> gestion matières</a> <i class='far fa-folder-open'></i></button><br>

<button style='font-size:24px'><a href="<c:url value="/admin/GestionEtudiant" > gestion étudiants</a> <i class='fas fa-graduation-cap'></i></button><br>

<button style='font-size:24px'><a href="<c:url value="/admin/GestionEnseignant"/>gestion enseignants</a> <i class='fas fa-chalkboard-teacher'></i></button><br>

<button style='font-size:24px'><a href="<c:url value="/admin/GestionDepartement"/>gestion départements</a> <i class='fas fa-shapes'></i></button><br>

<br>

</table>

<button type="submit" class="btn"><a href="<c:url value="/j_spring_security_logout"/ > Se déconnecter </a></button>


</form:form>
</body>
</html>