<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME!</title>
</head>

<body>
<center><h1 style=color:teal>LOGIN PORTAL<hr><h1></center>
<form method="post" action="LoginServlet">
	<table>
		<tr>
			<td>UserName</td>
			<td><input type="text" name="uName" placeholder="User Name"/></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="pwd" placeholder="Password"/></td>
		</tr>
		<tr>
			<td><input type="submit" name="Login"/></td>
		</tr>
	</table>
</form>
</body>
</html>