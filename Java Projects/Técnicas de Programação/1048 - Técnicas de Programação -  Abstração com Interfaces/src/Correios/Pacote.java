package Correios;

public class Pacote extends Encomenda implements Entrega {
	private double peso;
	private String descricao;

	public Pacote(String id, String org, String dest, double peso, String descricao) {
		super(id, org, dest);
		this.peso = peso;
		this.descricao = descricao;
	}

	@Override
	public String getIdentificador() {
		return super.getIdentificador();
	}

	@Override
	public String getCidadeOrigem() {
		return super.getCidadeOrigem();
	}

	@Override
	public String getCidadeDestino() {
		return super.getCidadeDestino();
	}

	public double getPeso() {
		return peso;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void getPacote(Entrega e) {
		System.out.println("\n    -- Pacote --"
						 + "\n        Id: " 	+ e.getIdentificador()
						 + "\n    Origem: " 	+ e.getCidadeOrigem()
						 + "\n   Destino: " 	+ e.getCidadeDestino()
						 + "\n      Peso: " 	+ peso 
						 + "\n Descrição: " 	+ descricao);
	}
}
