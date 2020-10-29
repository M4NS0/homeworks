package br.com.funcionarios.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.funcionarios.controle.FuncionarioControle;
import br.com.funcionarios.dao.FuncionarioDao;
import br.com.funcionarios.modelo.Funcionario;


@WebServlet("/ServletConsultaPorId")
public class ServletConsultaPorID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;   
    public ServletConsultaPorID() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		gson = new GsonBuilder().setPrettyPrinting().create();
		Funcionario funcionario = new Funcionario();

		int id=0;
		String strId= request.getParameter("id");
		
		id = Integer.parseInt(strId);
		

		if ((strId == null || strId.length()==0) || strId.isEmpty() && id == 0)
			funcionario.setMensagem("Informação inválida");
		else
		{
			FuncionarioDao fd = new FuncionarioDao();
			funcionario = fd.getFuncionarioViaId(id);
		    
		}
		String retornoJsonString = this.gson.toJson(funcionario);
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

