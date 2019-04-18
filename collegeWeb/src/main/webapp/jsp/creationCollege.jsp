<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Enregistrement d'un coll�ge:

<form:form modelAttribute="college" action="/collegeWeb/admin/addCollege">
Nom du College: <form:input path="nom" type="text"/> <br>
Site internet: <form:input path="siteInternet" type="text"/> <br>

<button type="submit" class="btn"> Valider </button>
</form:form>


<table class="table" style="width: 600px">
 <thead>
         <tr>
           <th width="60" align="center">Nom du coll�ge :</th>
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

</body>
</html>