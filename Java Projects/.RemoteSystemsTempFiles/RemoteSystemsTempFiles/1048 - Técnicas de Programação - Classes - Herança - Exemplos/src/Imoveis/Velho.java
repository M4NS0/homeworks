package Imoveis;

public class Velho extends Imovel {
	private Double desconto;
	private double precoFinal;

	public Velho(String endereco, Double preco, Double desc) {
		super(endereco, preco);
		this.desconto = desc;
	}

	public void desconta() {
		precoFinal = preco - (preco * (desconto / 100));
	}
	
	public String getString() {
		String aux = "\n          Endereço:  " + getEndereco() + "\n" 
				    + "   Valor do Imóvel: " + preco + "R$\n "
				    + "     Com desconto: " + precoFinal + "R$\n";

		return aux;

	}
	
	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	

}
