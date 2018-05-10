<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login page</title>
</head>
<body>
<div>
	<p>  The time on the server is ${serverTime}. </p>
	<h2> Login </h2>
	<sf:form method="POST" action="">
		<fieldset>
			<table cellspacing="0">
				<tr>
					<th><label for="login">Login:</label></th>
					<td><input type="text" name="login" id="login" size="20" maxlength="20" requared /></td>
				</tr>
				<tr>
					<th><label for="password">Password:</label></th>
					<td><input type="text" name="password" id="password" size="20" maxlength="20" requared /></td>
				</tr>
				<tr colspan="2">
					<input type="submit" value="Login">
				</tr>
			</table>
		</fieldset>
	</sf:form>
	<h3><a href="/UserWebMVC/register">Registration</a></h3>
</div>
</body>
</html>