package br.com.cadastros.old;

import br.com.cadastros.modelo.Funcionario;

public class TesteFuncionarioDao {
	public static void main(String[] args) {
		
		// Testando para implementação do servlet
		String nome = "Bruno C. Manso";
		String cpf = "70399247149";
		String nascimento = "30/10/1980";
		Double salario = 2000.00;
		String nomeDepartamento = "Diretoria";
		String nomeCargo = "Diretor";
		
		Funcionario novo = new Funcionario();
		novo.setNome(nome);
		novo.setCpf(cpf);
		novo.setNascimento(nascimento);
		novo.setSalario(salario);
		
		
		
		// Busca id do departamento e cargo relativo ao que foi escolhido no dropdown menu
		
//		novo.setDepartamentoId(DepartamentoDao.retornaPorNome(nomeDepartamento));
//		novo.setCargoId(CargoDao.retornaPorNome(nomeCargo));
		
		// O objeto esta pronto para ser persistido 
		if (FuncionarioDao.adicionaFuncionario(novo) == true) { 
			System.out.println("Inserido com sucesso!");
		} else {
			System.out.println("Não foi inserido, verifique a depuração dos dados sql");
		}
		
	}
}
