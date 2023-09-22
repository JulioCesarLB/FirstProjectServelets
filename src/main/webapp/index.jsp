<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String [] esportes ={"Futebol","Vôlei", "Tênis", "Basquete","Patins"};
	for(String s : esportes)
		out.print("<li> "+s+"</li>");
%>

</body>
</html>