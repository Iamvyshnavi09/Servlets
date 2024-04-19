<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>

<c:out value="${10+30}"></c:out>
<c:set var = "userid" scope = "session" value="${5}" />
   The defined value in the session scope is: <c:out value = "${userid}"/>
    <c:remove var="userid" scope="session"/>
    The value after removal is: <c:out value = "${userid}"/>
    
    <c:set var="score" scope="request" value="${85}" />

    <c:if test="${score >= 70}">
        <p>You got A++ grade.</p>
    </c:if>
    
    <c:if test="${score < 70}">
        <p>You got A grade.</p>
    </c:if>
   
</body>
</html>