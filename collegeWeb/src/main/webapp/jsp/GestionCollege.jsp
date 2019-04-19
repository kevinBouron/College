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
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Accueil Admin</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light ">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
    <a class="navbar-brand" ><h1>Accueil Administrateur</h1></a>
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="/collegeWeb/admin/home"><h2 style="color:grey"><i class="fas fa-home"></i>Accueil</h2><span class="sr-only">(current)</span> </a>
      </li>
      
      <li class="nav-item" >
        <a href="<c:url value="/j_spring_security_logout"  />"><h2 style="color:grey"><i class="fas fa-sign-out-alt"></i>Se d�connecter </h2> <span class="sr-only">(current)</span></a>
      </li>
    </ul>
   
  </div>
</nav>




<table  style="width:100%; margin-left:350px">

<tr><td><button style='font-size:24px; width:50%'><a href="/collegeWeb/admin/GestionCollege"> Creation des colleges</a> <i class='far fa-folder-open'></i></button></td></tr>

<tr><td><a href="/collegeWeb/admin/GestionDepartement"><button style='font-size:24px; width:50%'> <i class='fas fa-shapes'></i> Gestion des d�partements</button></a></td></tr>

<tr><td><button style='font-size:24px; width:50%'><a href="/collegeWeb/admin/GestionEnseignant"/>Gestion des enseignants</a> <i class='fas fa-chalkboard-teacher'></i></button></td></tr>

<tr><td><button style='font-size:24px; width:50%'><a href="/collegeWeb/admin/GestionEtudiant" > Gestion des �tudiants</a> <i class='fas fa-graduation-cap'></i></button></td></tr>

<tr><td><button style='font-size:24px; width:50%'><a href="/collegeWeb/admin/GestionSalles" > Gestion des salles</a> <i class='far fa-building'></i></button></td></tr>

<tr><td><button style='font-size:24px; width:50%'><a href="/collegeWeb/admin/GestionMatiere"> Gestion des mati�res</a> <i class='far fa-folder-open'></i></button></td></tr>





</table>





</body>
</html>