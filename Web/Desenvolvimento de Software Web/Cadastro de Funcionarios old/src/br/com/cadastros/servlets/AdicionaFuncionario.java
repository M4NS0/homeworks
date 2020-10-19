package br.com.cadastros.old;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import br.com.cadastros.modelo.Funcionario;
import br.com.cadastros.persistencia.CargoDao;
import br.com.cadastros.persistencia.DepartamentoDao;
import br.com.cadastros.persistencia.FuncionarioDao;

/**
 * Servlet implementation class AdicionaFuncionario
 */
@WebServlet("/AdicionaFuncionario")
public class AdicionaFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionaFuncionario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String nascimento = request.getParameter("nascimento");
		Double salario =  Double.parseDouble(request.getParameter("salario"));
		String departamento = request.getParameter("departamento");
		String cargo = request.getParameter("cargo");
		
		
		
		Funcionario novo = new Funcionario();
		novo.setNome(nome);
		novo.setCpf(cpf);
		novo.setNascimento(nascimento);
		novo.setSalario(salario);
		
		// Busca id do departamento e cargo relativo ao que foi escolhido no dropdown menu

//		novo.setDepartamentoId(DepartamentoDao.retornaPorNome(departamento));
//		novo.setCargoId(CargoDao.retornaPorNome(cargo));
		
		
		
		if (FuncionarioDao.adicionaFuncionario(novo) == true) { 
			JOptionPane.showMessageDialog(null, "\n Inserido com sucesso!");
			response.setContentType("text/html;charset=UTF-8");
			
			// Html com JavaScript de Reload do index.html
			response.getWriter().print("<html lang=\"en\">\n" + 
					"<head>\n" + 
					"    <meta charset=\"UTF-8\">\n" + 
					"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
					"    <title>Reloading</title>\n" + 
					"    <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n" + 
					"</head>\n" + 
					"<body>\n" + 
					"    <script>\n" + 
					"       window.location.replace(\"index.html\");\n" + 
					"    </script>\n" + 
					"</body>\n" + 
					"</html>");
			
		} else {
			JOptionPane.showMessageDialog(null, "Não foi inserido, verifique a depuração dos dados MySQL");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
