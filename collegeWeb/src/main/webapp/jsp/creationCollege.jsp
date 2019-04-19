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
<title>Enregistrement d'un collège:</title>
</head>
<body>


<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
<h1>Enregistrement d'un collège:</h1>
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





<form:form modelAttribute="college" action="/collegeWeb/admin/addCollege">
<form:input path="idCollege" type="hidden" />
Nom du College: <form:input path="nom" type="text"/> <br>
Site internet: <form:input path="siteInternet" type="text"/> <br>

<button type="submit" class="btn"> Valider </button>
</form:form>


<table class="table" style="width: 600px">
 <thead>
         <tr>
           <th width="60" align="center">Nom du collège :</th>
           <th width="60" align="center">Site internet :</th>
           <th width="60" align="center">Edit/Delete :</th>
         </tr>
       </thead>
         <tbody>
        
        
         <c:forEach items="${colleges}" var="c">
          <tr>
           
           <td width="60" align="center">${c.nom}</td>
           
           <td width="60" align="center">${c.siteInternet}</td>
           
           <td width="60" align="left"><a href="editCol?id=${c.idCollege}"><i class="fas fa-pen"></i>   </a><a href="suppCol?id=${c.idCollege}"><i class="far fa-trash-alt"></i></a></td>
           
         </tr>
    	 </c:forEach> 
       </tbody>
    </table>

</body>
</html>