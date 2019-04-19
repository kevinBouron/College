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
<title>Insert title here</title>
</head>
<body>


<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
<h1>Gestion des étudiants</h1>
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="/collegeWeb/admin/home">Active</a>
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




<form:form modelAttribute="etudiant" action="/collegeWeb/admin/addEtudiant">
<form:input path="idPersonne" type="hidden" />

<form:input path="nom" type="text" style="width: 600px"  class="form-control form-control-lg" placeholder="nom"></form:input>
 <br>
  <br>
  <form:input path="prenom" type="text" style="width: 600px"  class="form-control form-control-lg" placeholder="prenom"></form:input>
  <br>
   <br>
   <form:input path="mail" type="text" style="width: 600px"  class="form-control form-control-lg" placeholder="mail"></form:input>
  <br>
   <br>
   <form:input path="tel" type="text" style="width: 600px"  class="form-control form-control-lg" placeholder="tel"></form:input>
  <br>
   <br>
   <form:input path="anneEntree" type="text" style="width: 600px"  class="form-control form-control-lg" placeholder="Année entrée (..../../..) "></form:input>
  
 <br>



<form:button type="submit" value="valider" >valider</form:button>

<table class="table" style="width: 600px">
 <thead>
         <tr>
           <th width="60" align="center">Nom Etudiant </th>
           <th width="60" align="center">Prenom Etudiant</th>
            <th width="60" align="center">Mail </th>
           <th width="60" align="center">Tel</th>
           <th width="60" align="center">Année d'entrée</th>
           
           
           <th width="60" align="center">Edit/Delete</th>
         </tr>
       </thead>
         <tbody>
         <c:forEach items="${etudiants}" var="p">
         <tr>
         
           <td width="60" align="center">${p.nom}</td>

           <td width="60" align="center">${p.prenom}</td>
           
            <td width="60" align="center">${p.mail}</td>

           <td width="60" align="center">${p.tel}</td>
           
           <td width="60" align="center">${p.anneEntree}</td>
           
           <td width="60" align="left"><a href="editEtu?id=${p.idPersonne}"><i class="fas fa-pen"></i>   </a><a href="suppEtu?id=${p.idPersonne}"><i class="far fa-trash-alt"></i></a></td>

          

          
         </tr>
       </c:forEach>
       </tbody>
    </table>




</form:form>
</body>
</html>