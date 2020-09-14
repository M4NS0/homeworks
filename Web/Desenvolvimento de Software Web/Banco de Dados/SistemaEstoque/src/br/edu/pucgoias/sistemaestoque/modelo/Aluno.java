package br.edu.pucgoias.sistemaestoque.modelo;

public class Aluno {

	private int id;
	private String descricao;
	private double quantidade;
	private double preunit;

	public Aluno() {
	}

	public Aluno(int id, String descricao, double quantidade, double preunit) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preunit = preunit;
	}

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

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreunit() {
		return preunit;
	}

	public void setPreunit(double preunit) {
		this.preunit = preunit;
	}

	@Override
	public String toString() {
		return "Estoque [id=" + id + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preunit=" + preunit
				+ "]";
	}
}