<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
Integer count = (Integer)application.getAttribute("hitcount");
if(count==null){
	count=1;
	
}else{
	count++;
}
application.setAttribute("hitcount",count);


%>
<h1 style = "color:brown;text-align:center"> <%=count %> visitors have viewed This single page on this website</h1>
