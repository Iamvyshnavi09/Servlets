
<%@ page import="java.util.Date" %>

<%-- Jsp comment --%>
<%!
Date d = null;
String date = "";
%>
<!-- Html comment -->
<% d = new Date();
date = d.toString();
 // java comment
 /*multiple line comments*/
 /**java doc**/
 %>
 
 <h1 style='text-align:center;color:blue'>Today date is : <%=date %></h1>