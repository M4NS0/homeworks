package imoveis;

public class Novo extends Imovel {
	private Double acrecimo;
	private double precoFinal;

	public Novo(String endereco, Double preco, Double acrecimo) {
		super(endereco, preco);
		this.acrecimo = acrecimo;
	}
	
	public void acrescenta() {
		precoFinal = preco + (preco * (acrecimo / 100));
	}
	
	public String getString() {
		String aux = "\n          Endereço:  " + getEndereco() + "\n" 
				    + "   Valor do Imóvel: " + preco + "R$\n "
				    + "     Com acrécimo: " + precoFinal + "R$\n";
		return aux;
	}
	
	public Double getacrecimo() {
		return acrecimo;
	}

	public void setacrecimo(Double acrecimo) {
		this.acrecimo = acrecimo;
	}


}
