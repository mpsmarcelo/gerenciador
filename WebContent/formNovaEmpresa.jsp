<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <c:url value="/novaEmpresa" var="linkServeletNovaEmpresa"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova empresa</title>
</head>
<body>
		<form action="${linkServeletNovaEmpresa}" method="post" >
			Nome: <input type="text" name="nome">
			Cnpj: <input type="txt" name="cnpj">
			<input type="submit">
		</form>
</body>
</html>