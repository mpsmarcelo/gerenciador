<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
 %>
<%@
    page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"
 %>
 <%@
 	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<c:forEach items="${listaEmpresas}" var="empresa">
				<li>
					${empresa.nome} 
				</li>
		</c:forEach>
		
</body>
</html>