package interfaces3;

import java.sql.Date;

public class Pessoa {
	String nome;
	String endereço;
	Date nascimento;
	
	public Pessoa() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereço=" + endereço + ", nascimento=" + nascimento + "]";
	}
		
}
