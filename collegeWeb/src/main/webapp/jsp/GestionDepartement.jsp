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
<title>Gestion Département</title>
</head>
<body>


<br>
<form:form modelAttribute="departement" action="/collegeWeb/admin/adddDepartement">

Nom du département: <form:input path="nomDepartement" type="text"/> <br>
College: <form:select path="college.idCollege" items="${colleges}" itemValue="idCollege" itemLabel="idCollege"></form:select> <br>
Enseignant : <form:select path="responsable.idPersonne" items="${enseignants}" itemValue="idPersonne" itemLabel="nom"></form:select>
<br>
<button type="submit" class="btn"> Valider </button>

</form:form>
<br>

<table class="table" style="width: 600px">
 <thead>
         <tr>
           <th width="60" align="center">Nom Département </th>
           <th width="60" align="center">Enseignant Responsable</th>
           <th width="60" align="center">Edit/Delete</th>
         </tr>
       </thead>
         <tbody>
         <c:forEach items="${departements}" var="d">
         <tr>
         
           <td width="60" align="center">${d.nomDepartement}</td>

           <td width="60" align="center">${d.responsable}</td>
           
           <td width="60" align="left"><a href="editDep?id=${d.idDepartement}"><i class="fas fa-pen"></i>   </a><a href="suppDep?id=${d.idDepartement}"><i class="far fa-trash-alt"></i></a></td>

          

          
         </tr>
       </c:forEach>
       </tbody>
    </table>


</body>
</html>