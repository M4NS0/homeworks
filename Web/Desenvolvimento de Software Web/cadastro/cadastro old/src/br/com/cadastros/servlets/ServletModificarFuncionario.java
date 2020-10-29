package br.com.cadastros.old;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cadastros.modelo.Funcionario;
import br.com.cadastros.persistencia.CargoDao;
import br.com.cadastros.persistencia.DepartamentoDao;
import br.com.cadastros.persistencia.FuncionarioDao;

/**
 * Servlet implementation class ServletModificarFuncionario
 */
@WebServlet("/ServletModificarFuncionario")
public class ServletModificarFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ServletModificarFuncionario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String nascimento = request.getParameter("nascimento");
		String salario = request.getParameter("salario");
		String departamento = request.getParameter("departamento");
		String cargo = request.getParameter("cargo");
		String capitalizeWord = "";

		String words[] = nome.split("\\s");
		capitalizeWord = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord += first.toUpperCase() + afterfirst + " ";
		}

		Double salarioDouble = Double.parseDouble(salario);
		int cargoId = CargoDao.retornaPorNome(cargo);
		int depId = DepartamentoDao.retornaPorNome(departamento);
		//Funcionario funcionario = new Funcionario(cargoId, depId, capitalizeWord, cpf, nascimento, salarioDouble);

		//FuncionarioDao.alterarFuncionario(funcionario, cpf);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
