<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Test Application</title>
<link href="css/layout.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<jsp:include page="layout/header.jsp" />
	<form:form action="/OnlineTestExamWebApp/login/testStart"
		commandName="candidate" method="GET">
		<div id="container">
			<div id="description" align="left">
				<c:if test="${!empty testExam}">
			${testExam}
			</c:if>
				<c:if test="${empty testExam}">
			hello
			</c:if>
			</div>
			<div align="right">
				<table>
					<tr>
						<td>Username :</td>
						<td><input type="text" name="uname" /></td>
					</tr>
					<tr>
						<td>Password :</td>
						<td><input type="password" name="pwd" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Login" /></td>
					</tr>
				</table>
			</div>
		</div>

	</form:form>
	<jsp:include page="layout/footer.jsp" />
</body>
</html>