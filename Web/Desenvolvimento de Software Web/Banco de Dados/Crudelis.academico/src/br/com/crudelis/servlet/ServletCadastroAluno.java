package br.com.crudelis.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import br.com.crudelis.csv.SalvarCsv;
import br.com.crudelis.model.Aluno;

@WebServlet("/ServletCadastroAluno")
public class ServletCadastroAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletCadastroAluno() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Random random = new Random();
		int numero = random.nextInt(100);

		String nome = request.getParameter("nome");
		String dataDeNascimento = request.getParameter("nasc");
		String email = request.getParameter("email");
		String registroDoAluno = "20202" + numero;
		String curso = request.getParameter("curso");

		Aluno aluno = new Aluno(nome, dataDeNascimento, email, Integer.parseInt(registroDoAluno), curso);
		SalvarCsv salvar = new SalvarCsv();
		salvar.adcionarAlunoAoCsv(aluno);

		JOptionPane.showMessageDialog(null, "\n\tNome: " + nome 
				+ "\n\tData de nascimento: " + dataDeNascimento 
				+ "\n\tEmail: " + email
				+ "\n\tRegistro do aluno: " + registroDoAluno 
				+ "\nCurso: " + curso, 
				"Cadastrado com Sucesso!", JOptionPane.PLAIN_MESSAGE);
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print("<!DOCTYPE html>\n" + 
				"<html>\n" + 
				"\n" + 
				"<head>\n" + 
				"	<meta charset=\"UTF-8\">\n" + 
				"	<title>Crudelis Acadêmico</title>\n" + 
				"	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">	\n" + 
				"	<link href=\"https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap\" rel=\"stylesheet\">\n" + 
				"	<link href=\"https://fonts.googleapis.com/css2?family=Kufam&family=Permanent+Marker&display=swap\" rel=\"stylesheet\">\n" + 
				"	\n" + 
				"	<style>\n" + 
				"		body {\n" + 
				"		/* Seletor de todo corpo do texto  */\n" + 
				"			font-family: 'Kufam', cursive;\n" + 
				"			background: #ADA996;\n" + 
				"			/* fallback for old browsers */\n" + 
				"			background: -webkit-linear-gradient(to left, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);\n" + 
				"			/* Chrome 10-25, Safari 5.1-6 */\n" + 
				"			background: linear-gradient(to left, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);\n" + 
				"			/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n" + 
				"\n" + 
				"		}\n" + 
				"		\n" + 
				"		/* Seletor de Título h3  */\n" + 
				"		h3 {\n" + 
				"			font-family: 'Kufam', cursive;\n" + 
				"			font-weight: bold;\n" + 
				"			margin-top: 30vh;\n" + 
				"			font-family: monospace;\n" + 
				"			color: rgb(43, 43, 68);\n" + 
				"			text-align: center;\n" + 
				"			text-shadow: 0 1px 1px rgba(0, 0, 0, 1);\n" + 
				"		}\n" + 
				"		\n" + 
				"		/* Seletor do span do Título h3  */\n" + 
				"		h3 span {\n" + 
				"			font-family: 'Permanent Marker', cursive;\n" + 
				"			color: rgb(150, 46, 46);\n" + 
				"		}\n" + 
				"	\n" + 
				"		\n" + 
				"		/* Seletor de todos os div dentro de body  */\n" + 
				"		body>div {\n" + 
				"\n" + 
				"			margin-top: 50px;\n" + 
				"			display: flex;\n" + 
				"			justify-content: center;\n" + 
				"\n" + 
				"		}\n" + 
				"\n" + 
				"		button.btn {\n" + 
				"			width: 20vw;\n" + 
				"			margin-top: 60px;\n" + 
				"			margin-left: 25px;\n" + 
				"			margin-right: 25px;\n" + 
				"			box-shadow: 0 5px 10px rgba(0, 0, 0, 0.6);\n" + 
				"		}\n" + 
				"		\n" + 
				"		/* Seletor de todos os spans contidos dentro de botões  */\n" + 
				"		body>div>button>span {\n" + 
				"			display: block;\n" + 
				"			text-align: center;\n" + 
				"		}\n" + 
				"	</style>\n" + 
				"</head>\n" + 
				"\n" + 
				"<body>\n" + 
				"\n" + 
				"\n" + 
				"	<h3> Cadastro incluido com <span>Sucesso! </span></h3><br>\n" + 
				"\n" + 
				"	<div>\n" + 
				"			\n" + 
				"		<button onclick=\"location.href='index.html'\" type=\"button\" class=\"btn btn-primary btn-lg\">Voltar </button>\n" + 
				"	\n" + 
				"	</div>\n" + 
				"</body>\n" + 
				"\n" + 
				"</html>");
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}