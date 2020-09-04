package br.edu.pucgoias.sistemaestoque.modelo;

public class Estoque {
	private int id;
	private String descricao;
	private Double quantidade;
	private Double precounit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecounit() {
		return precounit;
	}

	public void setPrecounit(Double precounit) {
		this.precounit = precounit;
	}

	@Override
	public String toString() {
		return "Estoque [id=" + id + ", descricao=" + descricao + ", quantidade=" + quantidade + ", precounit="
				+ precounit + "]";
	}

}
