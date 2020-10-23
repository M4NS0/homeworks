package br.com.funcionarios.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.funcionarios.controle.FuncionarioControle;
import br.com.funcionarios.modelo.Funcionario;

public class TesteDao {
	public static void main(String[] args) {
		FuncionarioControle ctr = new FuncionarioControle();
		List<Funcionario> lista = new ArrayList<Funcionario>();
		lista = ctr.getFuncionario();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNomeFuncionario());
			
		}
		
		FuncionarioDao ed = new FuncionarioDao();
		List<Funcionario> funcs = ed.getTodos();

		if (funcs == null) {
			System.out.println("nao retornou dados");
		}
		for (int i = 0; i < funcs.size(); i++) {
			System.out.println(funcs.get(i).getNomeFuncionario());

		}
	}
}
