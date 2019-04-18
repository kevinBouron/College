<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="note" action="/CollegeWeb/user/addNote">
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

<a href="<c:url value="/j_spring_security_logout"/>" >logout</a>

<table>
		<thead>
			<tr>
				<th>Matiere</th>
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
					
					<td><a href="edit?id=${note.idPersonne}">modifier</a></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>



</body>
</html>