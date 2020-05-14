package Trabalhadores;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;

	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public void imprimePessoa() {
		System.out.println("- Pessoa\n Nome: " + nome + "\nIdade: " + idade + "\n Sexo: " + sexo);
	}
	
	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected String getSexo() {
		return sexo;
	}

	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
