package br.com.crudelis.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.crudelis.csv.Excluir;
import br.com.crudelis.csv.RetornarCsv;
import br.com.crudelis.model.Funcionario;

@WebServlet("/ServletExcluirFuncionario")
public class ServletExcluirFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletExcluirFuncionario() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String nomeBuscado = null;
		Funcionario funcionario = null;

		for (Funcionario f : RetornarCsv.getListaDeFuncionarios()) {
			if (f.getNome().equalsIgnoreCase(nome)) {
				nomeBuscado = nome;
				funcionario = f;
			}
		}

		if (nomeBuscado != null) {
			Excluir excluir = new Excluir();
			excluir.apagarElementoDaLista(funcionario);
			response.getWriter().append("EXCLUIDO");
		} else {
			response.getWriter().append("NAO EXCLUIDO");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
}