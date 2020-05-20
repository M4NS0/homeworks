package Trabalhadores;

public class Empregado extends Pessoa {
	protected Double salario;
	protected String matricula;

	public Empregado(String nome, int idade, String sexo, Double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}
	
	public void imprimeEmpregado() {
		System.out.println("- Empregado\n     Nome: " + nome 
								 + "\n     Idade: " + idade 
								 + "\n      Sexo: " + sexo 
								 + "\n Matrícula: " + matricula
								 + "\n   Salário: " + salario );
	}
	
	public Double valorInss() {
		return salario = (salario * 0.05);
		
	}

	protected Double getSalario() {
		return salario;
	}

	protected void setSalario(Double salario) {
		this.salario = salario;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
