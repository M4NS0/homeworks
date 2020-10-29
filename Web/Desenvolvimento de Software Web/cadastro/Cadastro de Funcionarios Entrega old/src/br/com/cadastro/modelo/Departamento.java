package br.com.cadastro.modelo;

public class Departamento {
	int idDepartamento;
	String nomeDepartamento;
	private String mensagem;
	private int controle;

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public int getControle() {
		return controle;
	}
	
	public void setControle(int controle) {
		this.controle = controle;
	}
}
