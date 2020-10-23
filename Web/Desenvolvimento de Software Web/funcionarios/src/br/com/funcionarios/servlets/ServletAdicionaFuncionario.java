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

@WebServlet("/ServletAdicionaFuncionario")
public class ServletAdicionaFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

	public ServletAdicionaFuncionario() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		gson = new GsonBuilder().setPrettyPrinting().create();
		
		String id = request.getParameter("id");
		String nomeFuncionario = request.getParameter("nomeFuncionario");
		String cpf = request.getParameter("cpf");
		String nascimento = request.getParameter("nascimento");
		String salario = request.getParameter("salario");
		String nomeCargo = request.getParameter("nomeCargo");
		String nomeDepartamento = request.getParameter("nomeDepartamento");
		nomeDepartamento = nomeDepartamento.toLowerCase();
		nomeFuncionario = nomeFuncionario.toLowerCase();
		nomeCargo = nomeCargo.toLowerCase();
		double auxSalario = 0;
		int auxId = 0;
		
		if (id ==null || id.length() ==0 || id.isEmpty())
			auxId = 0;
		else
			auxId = Integer.parseInt(id);
		
		if (salario ==null || salario.length() ==0 || salario.isEmpty())
			auxSalario=0;
		else
			auxSalario = Double.parseDouble(salario);
		
		Funcionario funcionario = new Funcionario();
		List<Funcionario> lista = new ArrayList<>();
		boolean acao = false;
		if (nomeFuncionario == null || nomeFuncionario.length() == 0 || nomeFuncionario.isEmpty()) {
			
		} else {
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
				} else {
					funcionario.setMensagem("Cargo invalido");
				}
			}
			funcionario.setCargo(novoCargo);

			Departamento novoDepartamento = new Departamento();
			novoDepartamento.setNomeDepartamento(nomeDepartamento);

			DepartamentoDao departamentoDao = new DepartamentoDao();
			List<Departamento> listaDepartamento = new ArrayList<Departamento>();
			listaDepartamento = departamentoDao.getDepartamentoViaNome(nomeDepartamento);

			for (int i = 0; i < listaDepartamento.size(); i++) {
				if (listaDepartamento.get(i).getNomeDepartamento() == nomeDepartamento) {
					novoCargo.setCargoId(listaCargo.get(i).getCargoId());
				} else {
					funcionario.setMensagem("Departamento inválido");
				}
			}
			funcionario.setDepartamento(novoDepartamento);
			
			FuncionarioControle fc = new FuncionarioControle();
			funcionario = fc.salvarComMsg(funcionario);
			lista.add(funcionario);     
			
		}
		String retornoJsonString = "";
		retornoJsonString = this.gson.toJson(lista);   /// tentar passar funcionario se n funfar
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(retornoJsonString);
		out.flush();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
