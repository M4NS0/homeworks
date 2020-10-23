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

@WebServlet("/servleteditarporid")
public class ServletEditarPorID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;   
	    
    public ServletEditarPorID() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();
	    Estoque estoque=null;
		String descricao=request.getParameter("descricao");
		double precounit=0;
		double quantidade=0;
		int id=0;
		String strPu = request.getParameter("precounit");
		String strQt = request.getParameter("quantidade");
		String strId= request.getParameter("id");
		
		precounit = Double.parseDouble(strPu);
		quantidade = Double.parseDouble(strQt);
		id = Integer.parseInt(strId);

		if ((descricao == null || descricao.length()==0) && id == 0)
		{
			estoque = new Estoque();
			estoque.setId(0);
			estoque.setMensagem("Descrição inválida");
		}
		else
		{
			    estoque=new Estoque();
				estoque.setDescricao(descricao);
				estoque.setPrecounit(precounit);
				estoque.setQuantidade(quantidade);
				estoque.setId(id);
				EstoqueControle ec = new EstoqueControle();
				estoque = ec.salvarComMsg(estoque);
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
