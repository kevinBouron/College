<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Authentification</h1>
<form action="j_spring_security_check" method="post">
<table>
<tr>
<td>Login</td>
<td><input type="text" name="j_username"></td>
</tr>
<tr>
<td>Pass word</td>
<td><input type="password" name="j_password"></td>
</tr>
<tr>
<td><input type="submit" value="Login"></td>
</tr>
</table>
</form>

</body>
</html>