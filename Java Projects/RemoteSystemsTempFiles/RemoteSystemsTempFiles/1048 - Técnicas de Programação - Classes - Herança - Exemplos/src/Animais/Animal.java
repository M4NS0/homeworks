package Animais;

public class Animal {
	protected String nome;
	protected Double peso;

	public Animal(String nome, Double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public void imprimeAnimal() {
		System.out.println("\n- Animal\n  Nome: " + nome + "\n  Peso: " + peso);
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected Double getPeso() {
		return peso;
	}

	protected void setPeso(Double peso) {
		this.peso = peso;
	}
}
