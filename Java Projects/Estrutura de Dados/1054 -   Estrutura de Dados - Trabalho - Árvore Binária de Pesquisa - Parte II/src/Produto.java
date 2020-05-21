
public class Produto {
	private String descricao;
	private int matricula;
	private double preco;

	public Produto(int matricula, double preco, String descricao) {
		this.descricao = descricao;
		this.matricula = matricula;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getMatricula() {
		return matricula;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return 	" \n Matricula: " + matricula 
				+ " - Preço: " + preco
				+ " - Descricao: " + descricao ;
				
				
	}

}
