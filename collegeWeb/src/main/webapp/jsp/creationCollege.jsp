<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Enregistrement d'un collège:

<form:form modelAttribute="departement" action="/collegeWeb/admin/adddCollege">
Nom du College: <form:input path="nomDepartement" type="text"/> <br>
Site internet: <form:input path="siteInternet" type="text"/> <br>

<button type="button" class="btn"> Valider </button>
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
        
         <tr>
         <c:forEach items="${colleges}" var="c">
           <td width="60" align="center">${c.nom}</td>
           <td width="60" align="center">${c.siteInternet}</td>
           
           <td width="60" align="left"><a href="editCol?id=${d.idCollege}"><i class="fas fa-pen"></i>   </a><a href="suppCol?id=${d.idCollege}"><i class="far fa-trash-alt"></i></a></td>
           </c:forEach>  
         </tr>
    
       </tbody>
    </table>
<button type="button" class="btn"><a href="<c:url value="/j_spring_security_logout"/ > <i class="fas fa-sign-out-alt"></i> Se déconnecter </a></button>
</body>
</html>