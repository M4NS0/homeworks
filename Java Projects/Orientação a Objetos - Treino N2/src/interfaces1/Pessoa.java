package interfaces1;

import java.sql.Date;

public class Pessoa {
	public String nome;
	public String endereço;
	public String nascimento;
	
	public String Getnome () {
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
	
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public void andar() {
		
	}
	
}
