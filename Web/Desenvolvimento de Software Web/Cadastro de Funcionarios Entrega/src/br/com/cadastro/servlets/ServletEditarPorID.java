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
import br.com.cadastro.persistencia.CargoDao;
import br.com.cadastro.persistencia.DepartamentoDao;
import br.com.cadastro.persistencia.FuncionarioDao;

@WebServlet("/ServletEditarPorID")
public class ServletEditarPorID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;
	private Funcionario funcionario;

	public ServletEditarPorID() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();
		funcionario = null;
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String nascimento = request.getParameter("nascimento");
		Double salario = Double.parseDouble(request.getParameter("salario"));
		String departamento = request.getParameter("departamento");
		String cargo = request.getParameter("cargo");

		Funcionario acao = null;
		if ((nome == null || nome.length() == 0) && cpf.equals("0")) {
			funcionario = new Funcionario();
			funcionario.setCpf("0");
			funcionario.setMensagem("Descri��o inv�lida");
		} else {
			
			funcionario.setNome(nome);
			funcionario.setCpf(cpf);
			funcionario.setNascimento(nascimento);
			funcionario.setSalario(salario);

			CargoDao cargoDao = new CargoDao();
			funcionario.setCargo(cargoDao.getCargoAtravesDoNome(cargo));

			DepartamentoDao depDao = new DepartamentoDao();
			funcionario.setDepartamento(depDao.getDepartamentoAtravesDoNome(departamento));

			FuncionarioDao funcDao = new FuncionarioDao();
			acao = funcDao.salvarFuncionarioMsg(funcionario);
		}

		String retornoJsonString = this.gson.toJson(acao);
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
