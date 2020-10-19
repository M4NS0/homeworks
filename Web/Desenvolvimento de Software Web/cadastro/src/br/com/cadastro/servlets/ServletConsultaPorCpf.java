package br.com.cadastro.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.cadastro.modelo.Funcionario;
import br.com.cadastro.persistencia.FuncionarioDao;

@WebServlet("/ServletConsultaPorCpf")
public class ServletConsultaPorCpf extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletConsultaPorCpf() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();
		Funcionario funcionario = new Funcionario();

		String strCpf = request.getParameter("cpf");

		FuncionarioDao funcDao = new FuncionarioDao();
		funcionario = funcDao.getFuncionarioCpf(strCpf);

		String retornoJsonString = this.gson.toJson(funcionario);
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(retornoJsonString);
		out.flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
