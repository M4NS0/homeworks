package br.com.cadastros.old;

import java.util.ArrayList;



public class Test {
	public static void main(String[] args) {
		
		// Criando um novo funcionário
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Bruno C. Manso");
		funcionario.setNascimento("30/10/1980");
		funcionario.setCpf("70399247149");
		funcionario.setSalario(5000.00);
		
		// Criando Cargo
		Cargo cargo = new Cargo();
		cargo.setNomeCargo("Estagiário");
		// no Mysql será feito um insert into table.cargo (nomeCargo)
//		CargoDao.adicionaCargo(cargo);
		
		// Criando departamento
		Departamento departamento = new Departamento();
		departamento.setNomeDepartamento("Departamento de Tecnologia da Informação");
		

		// Adicionando cargo ao departamento
		//departamento.setNomeCargo(cargo);
		// Ao adicionar cargo ao departamento um IDcargo será criado
		// no MySql sera feito um 	insert into table.departamento (nomeDepartamento, IDcargo)		
		
		
		// Adicionando pessoas ao departamento
		//departamento.setDadosPessoa(funcionario);
		// no MySql sera feito um insert into table.funcionario (IDCargo, IDdepartamento, nome,cpf, nascimento, salario);
		
		
		ArrayList<Departamento> lista = new ArrayList<Departamento>();
		lista.add(departamento);
		
		
		Cadastros cadastros = new Cadastros(cargo, departamento, funcionario);
				
		// printando Funcionario
		
		/*
		for (int i  = 0; lista.size() > i; i ++) {
			System.out.println("\t -- Funcionarios -- \n");
			System.out.println("    Número: 00" + (i+1) 
								+ "\n    Nome: " + lista.get(i).dadosPessoa.getNome()
								+ "\n    Nascimento: " + lista.get(i).getDadosPessoa().getNascimento()
								+ "\n    CPF: " + lista.get(i).getDadosPessoa().getCpf()
								+ "\n    Salário: " + lista.get(i).getDadosPessoa().getSalario()
								+ "\n");
		}
		
		
		// printando cargos:
		
		for (int i  = 0; lista.size() > i; i ++) {
			System.out.println("\t -- Cargos -- \n");
			System.out.println("    " + lista.get(i).getNomeCargo().nomeCargo + "\n");
		}
	
		
		// printando departamentos:
		
		for (int i  = 0; lista.size() > i; i ++) {
			System.out.println("\t -- Departamentos -- \n");
			System.out.println("    " + lista.get(i).getNomeDepartamento() + "\n");
		}
	*/
	}
}
