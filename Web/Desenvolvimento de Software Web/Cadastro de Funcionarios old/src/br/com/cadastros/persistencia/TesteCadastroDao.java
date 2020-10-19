package br.com.cadastros.old;

import java.util.ArrayList;

import br.com.cadastros.modelo.Cadastros;

public class TesteCadastroDao {
	public static void main(String[] args) {
		ArrayList <Cadastros> lista = new ArrayList<Cadastros>();
		lista = CadastroDao.listaFuncionarios();
		
		for (int i = 0; i < lista.size(); i ++) {
			System.out.println("Funcionario 0" + (i+1));
			System.out.println("Nome: " + lista.get(i).getFuncionario().getNome());
			System.out.println("CPF: " + lista.get(i).getFuncionario().getCpf());
			System.out.println("Nascimento: " + lista.get(i).getFuncionario().getNascimento());
			System.out.println("Salário: " + lista.get(i).getFuncionario().getSalario());
			System.out.println("Departamento: " + lista.get(i).getDepartamento().getNomeDepartamento() + " - ID: " + lista.get(i).getDepartamento().getIdDepartamento());
			System.out.println("Cargo: " + lista.get(i).getCargo().getNomeCargo() + " - ID: " + lista.get(i).getCargo().getIdCargo() + "\n");
		}
	}
}
