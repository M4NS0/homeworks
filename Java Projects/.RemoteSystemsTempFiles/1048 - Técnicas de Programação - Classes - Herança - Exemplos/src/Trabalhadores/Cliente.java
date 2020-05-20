package Trabalhadores;

public class Cliente extends Pessoa {
	protected Double valorDivida;
	protected int nascimento;

	public Cliente(String nome, int idade, String sexo, Double divida, int nascim) {
		super(nome, idade, sexo);
		this.valorDivida = divida;
		this.nascimento = nascim;
	}
	public void imprimeCliente() {
		System.out.println("- Cliente\n      Nome: " + nome 
								 + "\n     Idade: " + idade 
								 + "\n      Sexo: " + sexo 
								 + "\nNascimento: " + nascimento 
								 + "\n    Divida: " + valorDivida);
	}
	
	protected Double getValorDivida() {
		return valorDivida;
	}

	protected void setValorDivida(Double valorDivida) {
		this.valorDivida = valorDivida;
	}

	protected int getNascimento() {
		return nascimento;
	}

	protected void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
}
