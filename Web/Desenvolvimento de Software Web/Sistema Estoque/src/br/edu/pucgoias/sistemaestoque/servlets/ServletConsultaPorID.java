package br.edu.pucgoias.sistemaestoque.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.edu.pucgoias.sistemaestoque.controle.EstoqueControle;
import br.edu.pucgoias.sistemaestoque.modelo.Estoque;

@WebServlet("/servletconsultaporid")
public class ServletConsultaPorID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;   
    public ServletConsultaPorID() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		gson = new GsonBuilder().setPrettyPrinting().create();
		Estoque estoque = new Estoque();

		int id=0;
		String strId= request.getParameter("id");
		
		id = Integer.parseInt(strId);
		
		String retorno ="ERRO";
		boolean acao=false;
		if ((strId == null || strId.length()==0) || strId.isEmpty() && id == 0)
			estoque.setMensagem("Informação inválida");
		else
		{
		    EstoqueControle ec = new EstoqueControle();
		    estoque = ec.getEstoquePorId(id);
		    
		}
		String retornoJsonString = this.gson.toJson(estoque);
   	    PrintWriter out = response.getWriter();
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    out.print(retornoJsonString);
	    out.flush();  	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

