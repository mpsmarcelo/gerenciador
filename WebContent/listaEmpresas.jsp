<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
 %>
<%@
    page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
		
		<ul>
		<%
			List<Empresa> listaEmpresas = (List<Empresa>)request.getAttribute("listaEmpresas");
			listaEmpresas.forEach(item -> {
		%>
				
			<li>
				<%=item.getNome() %> 
			</li>
		<%	
				}
			);	
		%>

		</ul>
		
</body>
</html>