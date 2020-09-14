package br.edu.pucgoias.sistemaestoque.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.pucgoias.sistemaestoque.controle.EstoqueControle;
import br.edu.pucgoias.sistemaestoque.modelo.Aluno;

@WebServlet("/ServletAll")
public class ServletAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletAll() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Aluno> lista = new ArrayList<>();
		Aluno estoque;
		EstoqueControle ec = new EstoqueControle();
		lista = ec.getTodos();
		String html ;
		

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}