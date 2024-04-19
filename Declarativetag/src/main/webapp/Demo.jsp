<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declarative tag</title>
</head>
<h1 style = "color:green; text-align:center">
<body>
<%!
int i = 10;
String k = "Java devloper";

public int run(){
	return i;
}
%>
The value of i is :  <%= run()%><br/>
The String  is : <%=k %>

</h1>

</body>
</html>