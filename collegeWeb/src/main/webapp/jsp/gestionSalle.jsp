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

<form:form modelAttribute="salle" action="/collegeWeb/admin/addSalles">

 nom: <form:input path="nom" type="text"/> <br>
<%-- Matières: <form:select path="Matiere.idMatiere" items="${matieres}" --%>
<%-- itemValue="idMatiere" itemLabel="nom"></form:select> --%>
nombre de place: <form:input path="nbrPlace" type="text"/> <br>
 <br>
 
 <form:button type="submit" value="valider" >valider</form:button>

<a href="<c:url value="/j_spring_security_logout"/>" >logout</a>



 <table class="table" style="width: 600px">
 <thead>
         <tr>
           <th width="60" align="center">Nom de la salle </th>
           <th width="60" align="center">Nombre de place </th>
          
           
           
           <th width="60" align="center">Edit/Delete</th>
         </tr>
       </thead>
         <tbody>
         <c:forEach items="${salles}" var="s">
         <tr>
         
           <td width="60" align="center">${s.nom}</td>

           <td width="60" align="center">${s.nbrPlace}</td>
           
      
           
           <td width="60" align="left"><a href="editSalle?id=${s.idSalle}"><i class="fas fa-pen"></i>   </a><a href="suppSalle?id=${s.idSalle}"><i class="far fa-trash-alt"></i></a></td>

          

          
         </tr>
       </c:forEach>
       </tbody>
    </table>





</form:form>


</body>
</html>