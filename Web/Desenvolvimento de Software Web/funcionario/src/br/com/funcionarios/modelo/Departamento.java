package br.com.funcionarios.modelo;

public class Departamento {
	private int departamentoid;
	private String nomeDepartamento;

	private String mensagem;
	private int controle;

	public int getDepartamentoid() {
		return departamentoid;
	}

	public void setDepartamentoid(int departamentoid) {
		this.departamentoid = departamentoid;
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

	@Override
	public String toString() {
		return "Departamento [departamentoid=" + departamentoid + ", nomeDepartamento=" + nomeDepartamento
				+ ", mensagem=" + mensagem + ", controle=" + controle + "]";
	}

}
