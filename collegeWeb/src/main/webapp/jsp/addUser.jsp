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
<form:form modelAttribute="admin" action="/collegeWeb/addAdmin">

login: <form:input path="userName" type="text"/> <br>
password: <form:input path="password" type="text"/> <br>
activer: <form:checkbox value="1" path="actived"/><br>
<form:button type="submit" value="valider" >ok</form:button>
</form:form>
</body>
</html>