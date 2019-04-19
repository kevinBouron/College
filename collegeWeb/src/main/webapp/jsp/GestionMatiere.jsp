<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' 
crossorigin='anonymous'>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Gestion Matière</title>
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-light bg-light ">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
    <a class="navbar-brand" ><h1>Gestion des matières</h1></a>
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="/collegeWeb/admin/home"><h2 style="color:grey"><i class="fas fa-home"></i>Accueil</h2> <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">										</a>
      </li>
      <li class="nav-item" >
        <a href="<c:url value="/j_spring_security_logout" />"><h2 style="color:grey"><i class="fas fa-sign-out-alt"></i>Se déconnecter </h2> <span class="sr-only">(current)</span></a>
      </li>
    </ul>
   
  </div>
</nav>


<form:form modelAttribute="matiere" action="/collegeWeb/admin/addMatiere">
<form:input path="idMatiere" type="hidden" />

nom: <form:input path="nom" type="text" style="width: 600px" class="form-control form-control-lg" placeholder="nom"/> <br>

<%-- Matière: <form:select path="Matiere.idMatiere" items="${matieres}" itemValue="idMatiere" itemLabel="nom"></form:select> <br> --%>
Salle: <form:select path="salle.idSalle" items="${salles}" style="width: 570px" itemValue="idSalle" itemLabel="nom"></form:select> <br>
<%-- Enseignant : <form:select path="Enseignant.idPersonne" items="${enseignants}" itemValue="idPersonne" itemLabel="Enseignant"></form:select> --%>
<br>

<button type="submit" class="btn"> Valider </button>

<br>
<br>




 <table class="table" style="width: 100%">
 <thead>
         <tr>
           <th width="60" align="center">Nom de la matière </th>
           <th width="60" align="center">Salle </th>
          
           
           
           <th width="60" align="center">Edit/Delete</th>
         </tr>
       </thead>
         <tbody>
         <c:forEach items="${matieres}" var="s">
         <tr>
         
           <td width="60">${s.nom}</td>

           <td width="60" >${s.salle}</td>
           
      
           
           <td width="60" align="left"><a href="editMat?id=${s.idMatiere}"><i class="fas fa-pen"></i>   </a><a href="suppMat?id=${s.idMatiere}"><i class="far fa-trash-alt"></i></a></td>

          

          
         </tr>
       </c:forEach>
       </tbody>
    </table>
</form:form>








</body>
</html>