package br.com.funcionarios.modelo;

public class Cargo {
	private int cargoId;
	private String nomeCargo;

	private String mensagem;
	private int controle;

	public int getCargoId() {
		return cargoId;
	}

	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
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
		return "Cargo [cargoId=" + cargoId + ", nomeCargo=" + nomeCargo + ", mensagem=" + mensagem + ", controle="
				+ controle + "]";
	}

}
