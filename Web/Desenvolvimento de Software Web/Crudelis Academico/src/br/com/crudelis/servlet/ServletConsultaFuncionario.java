package br.com.crudelis.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.crudelis.csv.RetornarCsv;
import br.com.crudelis.model.Funcionario;

@WebServlet("/ServletConsultaFuncionario")
public class ServletConsultaFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletConsultaFuncionario() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String nomeBuscado = null;

		for (Funcionario f : RetornarCsv.getListaDeFuncionarios()) {
			if (f.getNome().equalsIgnoreCase(nome)) {
				nomeBuscado = nome;
			}
		}

		if (nomeBuscado != null) {
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().print("<!DOCTYPE html>\n" + "<html>\n" + "\n" + "<head>\n"
					+ "	<meta charset=\"UTF-8\">\n" + "	<title>Crudelis Acadêmico</title>\n"
					+ "	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">	\n"
					+ "	<link href=\"https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap\" rel=\"stylesheet\">\n"
					+ "	<link href=\"https://fonts.googleapis.com/css2?family=Kufam&family=Permanent+Marker&display=swap\" rel=\"stylesheet\">\n"
					+ "	\n" + "	<style>\n" + "		body {\n" + "		/* Seletor de todo corpo do texto  */\n"
					+ "			font-family: 'Kufam', cursive;\n" + "			background: #ADA996;\n"
					+ "			/* fallback for old browsers */\n"
					+ "			background: -webkit-linear-gradient(to left, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);\n"
					+ "			/* Chrome 10-25, Safari 5.1-6 */\n"
					+ "			background: linear-gradient(to left, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);\n"
					+ "			/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n" + "\n"
					+ "		}\n" + "		\n" + "		/* Seletor de Título h3  */\n" + "		h3 {\n"
					+ "			font-family: 'Kufam', cursive;\n" + "			font-weight: bold;\n"
					+ "			margin-top: 30vh;\n" + "			font-family: monospace;\n"
					+ "			color: rgb(43, 43, 68);\n" + "			text-align: center;\n"
					+ "			text-shadow: 0 1px 1px rgba(0, 0, 0, 1);\n" + "		}\n" + "		\n"
					+ "		/* Seletor do span do Título h3  */\n" + "		h3 span {\n"
					+ "			font-family: 'Permanent Marker', cursive;\n" + "			color: rgb(150, 46, 46);\n"
					+ "		}\n" + "				/* Seletor do sub-titulo  */\n" + "		h5 {\n"
					+ "			font-family: 'Kufam', cursive;\n" + "			margin-top: 50px;\n"
					+ "			color: rgb(70, 70, 70);\n" + "			font-family: monospace;\n"
					+ "			text-align: center;\n" + "			text-shadow: 0 1px 1px rgba(0, 0, 0, 0.9);\n" + "\n"
					+ "		}\n" + "		\n" + "		/* Seletor de todos os div dentro de body  */\n"
					+ "		body>div {\n" + "\n" + "			margin-top: 50px;\n" + "			display: flex;\n"
					+ "			justify-content: center;\n" + "\n" + "		}\n" + "\n" + "		button.btn {\n"
					+ "			width: 20vw;\n" + "			margin-top: 60px;\n" + "			margin-left: 25px;\n"
					+ "			margin-right: 25px;\n" + "			box-shadow: 0 5px 10px rgba(0, 0, 0, 0.6);\n"
					+ "		}\n" + "		\n" + "		/* Seletor de todos os spans contidos dentro de botões  */\n"
					+ "		body>div>button>span {\n" + "			display: block;\n"
					+ "			text-align: center;\n" + "		}\n" + "	</style>\n" + "</head>\n" + "\n"
					+ "<body>\n" + "	\n" + "\n" + "	<h3> Funcionário  <span>Encontrado! </span></h3><br>\n" + "\n"
					+ "	<div>\n" + "			\n"
					+ "		<button onclick=\"location.href='index.html'\" type=\"button\" class=\"btn btn-primary btn-lg\">Voltar </button>\n"
					+ "	\n" + "	</div>\n" + "</body>\n" + "\n" + "</html>");
		} else {
			/*
			 * JOptionPane.showMessageDialog(null, "Não Encontrado no Banco de Dados",
			 * nome, JOptionPane.PLAIN_MESSAGE);
			 */
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().print("<!DOCTYPE html>\n" + "<html>\n" + "\n" + "<head>\n"
					+ "	<meta charset=\"UTF-8\">\n" + "	<title>Cadastro de Alunos</title>\n"
					+ "	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n"
					+ "		integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n"
					+ "	<link href=\"https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap\" rel=\"stylesheet\">\n"
					+ "	<link href=\"https://fonts.googleapis.com/css2?family=Kufam&family=Permanent+Marker&display=swap\" rel=\"stylesheet\">\n"
					+ "	<style>\n" + "		body {\n" + "			font-family: 'Kufam', cursive;\n"
					+ "			background: #ADA996;\n" + "			/* fallback for old browsers */\n"
					+ "			background: -webkit-linear-gradient(to left, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);\n"
					+ "			/* Chrome 10-25, Safari 5.1-6 */\n"
					+ "			background: linear-gradient(to left, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);\n"
					+ "			/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n" + "		}\n"
					+ "\n" + "		h3 {\n" + "			font-family: 'Kufam', cursive;\n"
					+ "			font-weight: bold;\n" + "			margin-top: 30vh;\n"
					+ "			font-family: monospace;\n" + "			color: rgb(43, 43, 68);\n"
					+ "			text-align: center;\n" + "			text-shadow: 0 1px 1px rgba(0, 0, 0, 1);\n"
					+ "		}\n" + "\n" + "		h3 span {\n" + "			font-family: 'Permanent Marker', cursive;\n"
					+ "			color: rgb(150, 46, 46);\n" + "		}\n" + "\n" + "		h5 {\n"
					+ "			font-family: 'Kufam', cursive;\n" + "			margin-top: 50px;\n"
					+ "			color: rgb(70, 70, 70);\n" + "			font-family: monospace;\n"
					+ "			text-align: center;\n" + "			text-shadow: 0 1px 1px rgba(0, 0, 0, 0.9);\n" + "\n"
					+ "		}\n" + "\n" + "		body>div {\n" + "			margin-top: 50px;\n"
					+ "			display: flex;\n" + "			justify-content: center;\n" + "\n" + "		}\n" + "\n"
					+ "		html body div form div {\n" + "			display: flex;\n"
					+ "			justify-content: center;\n" + "			align-items: center;\n" + "\n" + "		}\n"
					+ "\n" + "		html body div form button {\n" + "			width: 20vw;\n"
					+ "			margin-top: 75px;\n" + "			margin-left: 25px;\n"
					+ "			margin-right: 25px;\n" + "			margin-bottom: 35px;\n"
					+ "			box-shadow: 0 5px 10px rgba(0, 0, 0, 0.6);\n" + "\n" + "		}	\n" + "\n" + "\n"
					+ "		form {\n" + "			font-family: 'Kufam', cursive;\n"
					+ "			font-weight: bold;\n" + "			color: rgb(70, 70, 70);\n"
					+ "			text-shadow: 0 1px 1px rgba(0, 0, 0, 0.9);\n" + "		}\n" + "\n"
					+ "		html body div form input {\n" + "			width: 100%;\n"
					+ "			background-color: rgb(131, 131, 131);\n" + "			color: white;\n"
					+ "			padding: 14px 20px;\n" + "			margin: 8px 0;\n" + "			border: none;\n"
					+ "			border-radius: 4px;\n" + "			cursor: auto;\n"
					+ "			box-shadow: 0 5px 10px rgba(0, 0, 0, 0.6);\n" + "\n" + "		}\n" + "		\n"
					+ "	</style>\n" + "</head>\n" + "\n" + "<body>\n"
					+ "	<h3> Consulte pelo nome do Funcionário </h3><br>\n" + "	<h5>  </h5>\n" + "\n" + "	<div>\n"
					+ "		<form method=\"post\" action=\"http://localhost:8282/Crudelis.academico/ServletConsultaFuncionario\">\n"
					+ "			<input type=\"text\" id=\"nome\" name=\"nome\" placeholder=\"use o nome completo para fazer consultas\" autocomplete=\"on\" required><br>\n"
					+ "			<div>\n"
					+ "			<button type=\"submit\" value=\"salvar\" name=\"Salvar\" class=\"btn btn-success btn-lg\">Buscar</button>\n"
					+ "			<button type=\"reset\" value=\"reset\" name=\"Limpar\" class=\"btn btn-danger btn-lg\">Limpar</button>\n"
					+ "			</div>\n" + "		</form>\n" + "	</div>\n"
					+ "	<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n"
					+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n"
					+ "<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n"
					+ "</body>\n" + "\n" + "</html>");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}