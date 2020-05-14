package correcao;

public class Produto {
	private String nome;
	private double preco;
	private String status;

	public Produto() {
		this.nome = "";
		this.preco = 0;
		this.status = "";
	}

	public Produto(String nome, double preco, String status) {
		this.nome = nome;
		this.preco = preco;
		this.status = status;
	}

	protected String getStatus() {
		return status;
	}

	protected String getNome() {
		return nome;
	}

	protected double getPreco() {
		return preco;
	}

}
