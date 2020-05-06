package viagensAgencia;

public class Pacote {
	private String descricao;
	private double preco;

	public Pacote() {
		this.descricao = "";
		this.preco = 0;
	}

	protected Pacote(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

}
