package br.com.cadastros.old;

import br.com.cadastros.modelo.Departamento;

public class TesteDepartamentoDao {
	public static void main(String[] args) {
		String nome = "diretoria";
		Departamento departamento = new Departamento();
		departamento.setNomeDepartamento(nome);

		// Adicionando novo cargo
		DepartamentoDao.adicionaDepartamento(departamento);
		// Inserindo id correspondente ao id do banco de dados
		
		// Retornando ultimo ID
		departamento.setIdDepartamento(DepartamentoDao.retornaUltimoId());
		
		// Alterando cargo
		String novoNome = "Diretoria";
		departamento.setNomeDepartamento(novoNome);
		DepartamentoDao.alterarDepartamento(departamento, DepartamentoDao.retornaUltimoId());

		// Exclui cargo
		// DepartamentoDao.excluirDepartamento(DepartamentoDao.retornaUltimoId());
		
		// Lista Departamentos
		for (int i = 0; DepartamentoDao.listaDepartamentos().size() > i; i++) {
			System.out.println("  ID: " + DepartamentoDao.retornaUltimoId());
			System.out.println("Nome: " + DepartamentoDao.listaDepartamentos().get(i).getNomeDepartamento());
		}

		// Retorna por ID
		Departamento novoDepartamento = new Departamento();
		novoDepartamento = DepartamentoDao.retornaPorId(DepartamentoDao.retornaUltimoId());
		System.out.println("Retornando por ID -> " + novoDepartamento.getNomeDepartamento());
		
		// Retorna por nome
		System.out.println(DepartamentoDao.retornaPorNome(novoNome));
		
	}
}
