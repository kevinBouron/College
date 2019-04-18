<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
<h1>Authentification</h1>
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