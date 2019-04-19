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

<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
<h1>Gestion des notes</h1>
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="#">Active</a>
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



<form:form modelAttribute="noter" action="/collegeWeb/user/addNote">
<br>
Etudiant: <form:select path="etudiant.idPersonne" items="${etudiants}"
itemValue="idPersonne" itemLabel="nom"></form:select>
 <br>
Matiere: <form:select path="matiere.idMatiere" items="${matieres}"
itemValue="idMatiere" itemLabel="nom"></form:select>
<br>
Note: <form:input path="note" type="text"/> <br>
<br>

<form:button type="submit" value="valider" >ok</form:button>
</form:form>



<table>
		<thead>
			<tr>
				<th>Matière</th>
				<th>Etudiant</th>
				<th>Note</th>
				<th>modifier</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${notes}" var="note">
				<tr>
					<td>${note.idMatiere}</td>
					<td>${note.idPersonne}</td>
					<td>${note.note}</td>
					
<%-- 					 <td width="60" align="left"><a href="editNote?id=${note.}"><i class="fas fa-pen"></i>   </a><a href="suppNote?id=${note}"><i class="far fa-trash-alt"></i></a></td> --%>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>



</body>
</html>