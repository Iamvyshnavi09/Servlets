<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<body style="text-align:center;color:green">
<h1 style ="color:Royalblue;text-align:center">Student Marks report</h1>
<h3>Java marks <%= request.getParameter("java") %></h3>
<h3>JDBC marks <%= request.getParameter("jdbc") %></h3>
<h3>Servlets marks <%= request.getParameter("servlets") %></h3>
<h3>JSP marks <%= request.getParameter("jsp") %></h3>

	<%

int result = (Integer)request.getAttribute("result");
out.println("<br> Average Marks is :  "+result);


%>

      <% if (result >=100 ) { %>
         <p> "Congratulations" You got Got First class</p>
      <% } else { %>
         <p style="color:red"> You have to work hard "All the Best"</p>
      <% } %>
      
   </body>


</body>
</html>