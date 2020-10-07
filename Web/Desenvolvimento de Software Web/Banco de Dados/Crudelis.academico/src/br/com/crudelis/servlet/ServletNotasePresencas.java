package br.com.crudelis.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNotasePresencas
 */
@WebServlet("/ServletNotasePresencas")
public class ServletNotasePresencas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNotasePresencas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// camada de persistência:
		// TODO gravar arquivo csv em array de objeto do tipo aluno
		// TODO fazer busca da matricula informada no array
		// nesta camada:
		// TODO criar novo objeto pessoa, salvar dados da busca no objeto, 
		// TODO inserir dados vindos do frontend (notaN1,notaN2,presenca)
		// TODO apagar dado encontrado no array
		// TODO adicionar pessoa de volta ao array
		// camada de persistência:
		// TODO passar passar para classe de persistencia e regravar
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
