package br.com.cadastro.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cadastro.modelo.Funcionario;
import br.com.cadastro.persistencia.CargoDao;
import br.com.cadastro.persistencia.DepartamentoDao;
import br.com.cadastro.persistencia.FuncionarioDao;

@WebServlet("/ServletAtualizar")
public class ServletAtualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletAtualizar() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String nascimento = request.getParameter("nascimento");
		Double salario = Double.parseDouble(request.getParameter("salario"));
		String departamento = request.getParameter("departamento");
		String cargo = request.getParameter("cargo");

		String retorno = "ERRO";
		boolean acao = false;
		if ((nome == null || nome.length() == 0) && cpf.equals("0"))
			retorno = "Descrição inválida";
		else {

			Funcionario funcionario = new Funcionario();
			if ((nome == null || nome.length() == 0) && cpf.equals("0")) {
				FuncionarioDao funcDao = new FuncionarioDao();
				acao = funcDao.excluir(cpf);

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
				acao = funcDao.salvarFuncionario(funcionario);
			}
			if (acao)
				retorno = "OK";
			response.setContentType("text/html);charset=utf-8");
			response.getWriter().print("resposta = " + retorno);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
