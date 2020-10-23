package br.com.funcionarios.controle;

import java.util.List;

import br.com.funcionarios.dao.DepartamentoDao;
import br.com.funcionarios.modelo.Departamento;

public class DepartamentoControle {
	private DepartamentoDao ed = new DepartamentoDao();
	//1=inclusão, 2=alteração, 3=exclusso
	public List<Departamento> getDepartamento(){
		List<Departamento> funcionarios = ed.getTodos();
		return funcionarios;
	}

	public Departamento getDepartamentoPorId(int id) {
		return ed.getDepartamentoViaId(id);
	}
	
	public boolean excluir(int id) {
		return ed.excluir(id);
	}
	
	public Departamento excluirMsg(int id) {
		return ed.excluirMsg(id);
	}
	
	public boolean salvar(Departamento estoque) {
		return ed.salvarDepartamento(estoque);
	}
	
	public Departamento salvarComMsg(Departamento estoque) {
		return ed.salvarDepartamentoMsg(estoque);
	}

	public List<Departamento> buscaDepartamentoPorNome(String nome){
		return ed.getDepartamentoViaNome(nome);
	}
	
	public List<Departamento> getDepartamentoPorIdLista(int id) {
		return ed.getDepartamentoPorIdLista(id);
	}
	
}
