package br.edu.pucgoias.sistemaestoque.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.pucgoias.sistemaestoque.controle.EstoqueControle;
import br.edu.pucgoias.sistemaestoque.modelo.Estoque;

@WebServlet("/ServletAtualizar")
public class ServletAtualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletAtualizar() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String descricao = request.getParameter("descricao");
		double preunit = Double.parseDouble(request.getParameter("preunit"));
		double quantidade = Double.parseDouble(request.getParameter("quantidade"));
		int id = Integer.parseInt(request.getParameter("id"));

		String retorno = "ERRO";
		boolean acao = false;
		if ((descricao == null || descricao.length() == 0) && id == 0) {
			retorno = "Descricao invalida!";
		} else {
			if ((descricao == null || descricao.length() == 0) && id != 0) {
				EstoqueControle ec = new EstoqueControle();
				acao = ec.excluir(id);
				if (acao) {
					retorno = "OK";
				} else {
					retorno = "DEU ALGUM PROBLEMA";
				}
			} else {
				EstoqueControle ec = new EstoqueControle();
				Estoque estoque = new Estoque();
				estoque.setDescricao(descricao);
				estoque.setPreunit(preunit);
				estoque.setQuantidade(quantidade);
				estoque.setId(id);
				try {
					acao = ec.salvar(estoque);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (acao) {
					retorno = "OK";
				} else {
					retorno = "Problema ao Salvar";
				}
			}
		}
		response.getWriter().println("Resposta: " + retorno);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}