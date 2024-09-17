<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Web Login</h1>
	<h2>${message}</h2>
	
	<form action="<c:url value='loginAction'/>" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username"/></td>				
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/></td>				
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="Login"></td>
			</tr>			
		</table>
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
	</form>
</body>
</html>