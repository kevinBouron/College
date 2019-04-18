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
<title>Accueil Admin</title>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
<h1>Gestion collège</h1>
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="/collegeWeb/admin/home">Aller à l'accueil Gestion</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link</a>
    </li>
    <li class="nav-item">
      <a class="nav-link disabled" href="#">Disabled</a>
    </li>
  </ul>
</nav>





<table>

<form:form modelAttribute="College" action="/collegeWeb/admin/home">

<button style='font-size:24px'><a href="/collegeWeb/admin/GestionSalles" > Gestion salles</a> <i class='far fa-building'></i></button><br>

<button style='font-size:24px'><a href="/collegeWeb/admin/GestionMatiere"> Gestion matières</a> <i class='far fa-folder-open'></i></button><br>

<button style='font-size:24px'><a href="/collegeWeb/admin/GestionEtudiant" > Gestion étudiants</a> <i class='fas fa-graduation-cap'></i></button><br>

<button style='font-size:24px'><a href="/collegeWeb/admin/GestionEnseignant"/>Gestion enseignants</a> <i class='fas fa-chalkboard-teacher'></i></button><br>

<button style='font-size:24px'><a href="/collegeWeb/admin/GestionDepartement"/>Gestion départements</a> <i class='fas fa-shapes'></i></button><br>

<br>

</table>

<button type="submit" class="btn"><a href="<c:url value="/j_spring_security_logout"/ > Se déconnecter </a></button>


</form:form>
</body>
</html>