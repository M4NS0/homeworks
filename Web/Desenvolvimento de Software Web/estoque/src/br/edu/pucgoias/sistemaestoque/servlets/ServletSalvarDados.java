package br.edu.pucgoias.sistemaestoque.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.edu.pucgoias.sistemaestoque.controle.EstoqueControle;
import br.edu.pucgoias.sistemaestoque.modelo.Estoque;

@WebServlet("/servletsalvardados")
public class ServletSalvarDados extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;   
	
    public ServletSalvarDados() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		gson = new GsonBuilder().setPrettyPrinting().create();
		String descricao=request.getParameter("descricao");
		double precounit=0;
		double quantidade=0;
		int id=0;
		String strPu = request.getParameter("precounit");
		String strQt = request.getParameter("quantidade");
		String strId= request.getParameter("id");
		
		if (strPu ==null || strPu.length() ==0 || strPu.isEmpty())
			precounit=0;
		else
			precounit = Double.parseDouble(strPu);

		if (strQt  == null || strQt.length() ==0 || strQt.isEmpty())
		    quantidade = 0;
		else
			quantidade = Double.parseDouble(strQt);

		if (strId ==null || strId.length() ==0 || strId.isEmpty())
			   id=0;
		else
				id = Integer.parseInt(strId);
		
		Estoque estoque=new Estoque();
		List<Estoque> lista = new ArrayList<>();
		boolean acao=false;
		if (descricao == null || descricao.length()==0 || descricao.isEmpty())
		{	
			estoque.setMensagem("Descrição inválida");
		}
		else
		{
				estoque.setDescricao(descricao);
				estoque.setPrecounit(precounit);
				estoque.setQuantidade(quantidade);
				estoque.setId(id);
				EstoqueControle ec = new EstoqueControle();
				estoque = ec.salvarComMsg(estoque);
		}
	    String retornoJsonString ="";
	    retornoJsonString=this.gson.toJson(estoque);
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
