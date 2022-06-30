package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/listaEmpresas")
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		Banco banco = new Banco();
		
		
		RequestDispatcher despacher = request.getRequestDispatcher("/listaEmpesas.jsp");
		request.setAttribute("listaEmpresas", banco.getEmpresas());
		despacher.forward(request, response);			
		
	}

}
