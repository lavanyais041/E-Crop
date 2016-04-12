<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="login1.html" method="post" >
	
	<br/><br/>	
	
		<form:label path="userName">User ID</form:label>
		<form:input path="userName"/>
		<br/>
		<form:label path="password">Password</form:label>
		<form:password path="password"/>
		<br/>

		<input type="submit" value="SUBMIT"/>
	</form:form>
</body>
</html>