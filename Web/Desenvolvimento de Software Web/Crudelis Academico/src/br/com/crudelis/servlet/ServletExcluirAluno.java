package br.com.crudelis.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.crudelis.csv.Excluir;
import br.com.crudelis.csv.RetornarCsv;
import br.com.crudelis.model.Aluno;

@WebServlet("/ServletExcluirFuncionario")
public class ServletExcluirAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletExcluirAluno() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String nomeBuscado = null;
		Aluno aluno = null;

		for (Aluno f : RetornarCsv.getListaDeAlunos()) {
			if (f.getNome().equalsIgnoreCase(nome)) {
				nomeBuscado = nome;
				aluno = f;
			}
		}

		if (nomeBuscado != null) {
			Excluir excluir = new Excluir();
			excluir.apagarElementoDaLista(aluno);
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