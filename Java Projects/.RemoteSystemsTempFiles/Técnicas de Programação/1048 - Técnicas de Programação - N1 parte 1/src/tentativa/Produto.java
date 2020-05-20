package tentativa;

public class Produto {
	private String nome, status;
	private double preco;

	public Produto() {
		this.nome = "";
		this.preco = 0;
		this.status = "";
	}

	public Produto(String nome, double preco, String status) {
		this.nome = nome;
		this.status = status;
		this.preco = preco;
	}

	protected String getNome() {
		return nome;
	}

	protected String getStatus() {
		return status;
	}

	protected double getPreco() {
		return preco;
	}

}
