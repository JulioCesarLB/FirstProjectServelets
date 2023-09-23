<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="autentica" method="post">
		<p>
			login: <input type="text" name="Login">
		</p>
		<p>
			login: <input type="password" name="Password">
		</p>
		<p>
			<input type="submit" value="entrar">
		</p>
		
		<p style="color:red; font-style:italic;">${msg}</p>
	</form>
</body>
</html>