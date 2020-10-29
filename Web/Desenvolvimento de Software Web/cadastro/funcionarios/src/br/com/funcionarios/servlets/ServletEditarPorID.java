package br.com.funcionarios.servlets;

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

import br.com.funcionarios.controle.FuncionarioControle;
import br.com.funcionarios.dao.CargoDao;
import br.com.funcionarios.dao.DepartamentoDao;
import br.com.funcionarios.modelo.Cargo;
import br.com.funcionarios.modelo.Departamento;
import br.com.funcionarios.modelo.Funcionario;



@WebServlet("/servleteditarporid")
public class ServletEditarPorID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;   
	    
    public ServletEditarPorID() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();
	    Funcionario funcionario=null;
	    String id = request.getParameter("id");
		String nomeFuncionario = request.getParameter("nomeFuncionario");
		String cpf = request.getParameter("cpf");
		String nascimento = request.getParameter("nascimento");
		String salario = request.getParameter("salario");
		String nomeCargo = request.getParameter("cargo");
		String nomeDepartamento = request.getParameter("departamento");
		
		
		double auxSalario=0;
		int auxId=0;
		
		auxSalario = Double.parseDouble(salario);
		auxId = Integer.parseInt(id);

		if ((nomeFuncionario == null || nomeFuncionario.length()==0) && auxId == 0)
		{
			funcionario = new Funcionario();
			funcionario.setFuncionarioId(0);
			funcionario.setMensagem("Nome inválido");
		}
		else
		{
			funcionario = new Funcionario();
			funcionario.setNomeFuncionario(nomeFuncionario);
			funcionario.setCpf(cpf);
			funcionario.setNascimento(nascimento);
			funcionario.setSalario(auxSalario);
			
			Cargo novoCargo = new Cargo();
			novoCargo.setNomeCargo(nomeCargo);
			
			CargoDao cargoDao = new CargoDao();
			List<Cargo> listaCargo = new ArrayList<Cargo>();
			listaCargo = cargoDao.getCargoViaNome(nomeCargo);
			
			for (int i = 0; i < listaCargo.size(); i++) {
				if (listaCargo.get(i).getNomeCargo() == nomeCargo) {
					novoCargo.setCargoId(listaCargo.get(i).getCargoId());
				}
			}
			funcionario.setCargo(novoCargo);
			
			Departamento novoDep = new Departamento();
			
			DepartamentoDao depDao = new DepartamentoDao();
			List<Departamento> listaDep = new ArrayList<Departamento>();
			listaDep = depDao.getDepartamentoViaNome(nomeDepartamento);
			
			for (int i = 0; i < listaDep.size(); i++) {
				if (listaDep.get(i).getNomeDepartamento() == nomeDepartamento) {
					novoDep.setDepartamentoid(listaDep.get(i).getDepartamentoid());
				}					
			}
			funcionario.setDepartamento(novoDep);
				FuncionarioControle ec = new FuncionarioControle();
				funcionario = ec.salvarComMsg(funcionario);
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
