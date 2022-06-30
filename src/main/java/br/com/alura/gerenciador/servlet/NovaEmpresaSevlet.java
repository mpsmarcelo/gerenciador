package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		
		
		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		empresa.setCnpj(cnpj);
		
		Banco banco  = new Banco();
		banco.adicionarEmpresa(empresa);
		
	    RequestDispatcher result = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
	    request.setAttribute("nomeEmpresa",empresa.getNome());
	    result.forward(request, response);
		
	}

}
