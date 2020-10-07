package br.com.hiccupSolucoes.cadastro.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import br.com.hiccupSolucoes.cadastro.controle.Validador;
import br.com.hiccupSolucoes.cadastro.controle.ValidadorCpf;

/**
 * Servlet implementation class Servlet01
 */
@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet01() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
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
		int cpfLen = cpf.length();

		String site = "index.html";

		if (ValidadorCpf.isCPF(cpf) == false || Validador.onlyDigits(cpf, cpfLen) == false
				|| ValidadorCpf.correctDigits(cpfLen) == false) {
			JOptionPane.showMessageDialog(null, "CPF inválido!");
			
		}
		
		if (Validador.checkMonetaryDigits(salario) == false) {
			  JOptionPane.showMessageDialog(null,"Duas casas apos a vírgula é obrigatório");
			  
		}
		else {

			String words[] = nome.split("\\s");
			capitalizeWord = "";
			for (String w : words) {
				String first = w.substring(0, 1);
				String afterfirst = w.substring(1);
				capitalizeWord += first.toUpperCase() + afterfirst + " ";
			}
			
			
/*
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter()
					.print("Nome: " + capitalizeWord + "<br>" + "Nascimento: " + nascimento + "<br>" + "CPF: "
							+ ValidadorCpf.imprimeCPF(cpf, cpfLen) + "<br>" + "Salário: " + salario + "<br>"
							+ "Departamento: " + departamento + "<br>" + "Cargo: " + cargo + "<br>");
*/
		}
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