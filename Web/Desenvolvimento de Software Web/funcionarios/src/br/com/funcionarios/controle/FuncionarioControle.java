package br.com.funcionarios.controle;

import java.util.List;

import br.com.funcionarios.dao.FuncionarioDao;
import br.com.funcionarios.modelo.Funcionario;

public class FuncionarioControle {
	
	private FuncionarioDao ed = new FuncionarioDao();
	//1=inclusão, 2=alteração, 3=exclusso
	public List<Funcionario> getFuncionario(){
		List<Funcionario> funcionarios = ed.getTodos();
		return funcionarios;
	}

	public Funcionario getFuncionarioPorId(int id) {
		return ed.getFuncionarioViaId(id);
	}
	
	public boolean excluir(int id) {
		return ed.excluir(id);
	}
	
	public Funcionario excluirMsg(int id) {
		return ed.excluirMsg(id);
	}
	
	public boolean salvar(Funcionario funcionario) {
		return ed.salvarFuncionario(funcionario);
	}
	
	public Funcionario salvarComMsg(Funcionario funcionario) {
		return ed.salvarFuncionarioMsg(funcionario);
	}

	public List<Funcionario> buscaFuncionarioPorNome(String nome){
		return ed.getFuncionarioViaNome(nome);
	}
	
	public List<Funcionario> getFuncionarioPorIdLista(int id) {
		return ed.getFuncionarioPorIdLista(id);
	}
	
}

