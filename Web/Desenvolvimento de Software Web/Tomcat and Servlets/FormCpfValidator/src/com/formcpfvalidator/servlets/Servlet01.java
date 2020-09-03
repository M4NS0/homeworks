package com.formcpfvalidator.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.formcpfvalidator.apps.CPFValidator;
import com.formcpfvalidator.apps.Validators;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String fone = request.getParameter("fone");
		String sal = request.getParameter("sal");
		String capitalizeWord = "";
		int cpfLen = cpf.length();

		if (CPFValidator.isCPF(cpf) == false 
				|| Validators.onlyDigits(cpf, cpfLen) == false
				|| CPFValidator.correctDigits(cpfLen) == false 
				|| cpf.isEmpty()) {
			JOptionPane.showMessageDialog(null, "CPF inválido!");
		}

		if (Validators.dontHaveLetters(fone) == false) {
			JOptionPane.showMessageDialog(null, "O telefone informado contém letras");
		}

		if (Validators.checkMonetaryDigits(sal) == false) {
			JOptionPane.showMessageDialog(null, "Duas casas apos a vírgula é obrigatório");
		}
		if (!nome.isEmpty()) {
			String words[] = nome.split("\\s");
			capitalizeWord = "";
			for (String w : words) {
				String first = w.substring(0, 1);
				String afterfirst = w.substring(1);
				capitalizeWord += first.toUpperCase() + afterfirst + " ";
			}
		} else {
			JOptionPane.showMessageDialog(null, "O Nome precisa ser preenchido");
		}
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print("Nome: " + capitalizeWord + "<br>" 
								 + "CPF: " + CPFValidator.imprimeCPF(cpf, cpfLen)+ "<br>" 
								 + "Fone: " + fone + "<br>" + "Salário: " + sal);
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