package Trabalhadores;

public class Gerente extends Empregado {
	protected String nomeGerencia;

	protected Gerente(String nome, int idade, String sexo, Double salario, String matricula, String nomeGerencia) {
		super(nome, idade, sexo, salario, matricula);
		this.nomeGerencia = nomeGerencia;
	}

	public void imprimeGerente() {
		System.out.println("- Gerente\n      Nome: " + nome 
								 + "\n     Idade: " + idade 
								 + "\n      Sexo: " + sexo 
								 + "\n Matrícula: " + matricula
								 + "\n  Gerencia: " + nomeGerencia
								 + "\n   Salário: " + salario );
	}
	
	public Double valorInss() {
		return salario = (salario * 0.05);
	}

	protected String getNomeGerencia() {
		return nomeGerencia;
	}

	protected void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
}
