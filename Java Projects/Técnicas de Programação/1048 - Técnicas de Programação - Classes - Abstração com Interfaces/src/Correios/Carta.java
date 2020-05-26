package Correios;

public class Carta extends Encomenda implements Entrega {
	private String texto;

	public Carta(String id, String org, String dest, String texto) {
		super(id, org, dest);
		this.texto = texto;
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

	public String getTexto() {
		return texto;
	}
	
	public void getCarta(Entrega e) {
		System.out.println("\n    -- Carta --"
						 + "\n      Id: " 	+ e.getIdentificador()
						 + "\n  Origem: " 	+ e.getCidadeOrigem()
						 + "\n Destino: " 	+ e.getCidadeDestino()
						 + "\n   Texto: " 	+ texto);
	}
}
