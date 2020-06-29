package trabalhadores;

public class Vendedor extends Empregado {
	protected Double valorVendas;
	protected int quantidadeVendas;

	protected Vendedor(String nome, int idade, String sexo, Double salario, String matricula, Double valorVendas,
			int quantidadeVendas) {
		super(nome, idade, sexo, salario, matricula);
		this.valorVendas = valorVendas;
		this.quantidadeVendas = quantidadeVendas;
	}
	public void imprimeVendedor() {
		System.out.println("- Vendedor\n        Nome: " + nome 
								 + "\n       Idade: " + idade 
								 + "\n        Sexo: " + sexo 
								 + "\n     Salário: " + salario 
								 + "\n   Matrícula: " + matricula
								 + "\nValor Vendas: " + valorVendas
								 + "\nQt de Vendas: " + quantidadeVendas);
	}
	
	protected Double getValorVendas() {
		return valorVendas;
	}

	protected void setValorVendas(Double valorVendas) {
		this.valorVendas = valorVendas;
	}

	protected int getQuantidadeVendas() {
		return quantidadeVendas;
	}

	protected void setQuantidadeVendas(int quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}
	

}
