package v2;

public class Pessoa {
	String nome;
	String matricula;
	String telefone;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getPessoa() {
		return "\n Nome: " + nome + "\n Matricula: " + matricula + "\n Telefone: " + telefone;
	}
	
}

