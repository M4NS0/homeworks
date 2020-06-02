package Correios;

public abstract class Encomenda implements Entrega {
	private String identificador;
	private String cidadeOrigem;
	private String cidadeDestino;
	
	protected Encomenda(String id, String org, String dest) {
		this.identificador = id;
		this.cidadeOrigem = org;
		this.cidadeDestino = dest;
	}
	
	@Override
	public String getIdentificador() {
		return identificador;
	}
	
	@Override
	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	@Override
	public String getCidadeDestino() {
		return cidadeDestino;
	}
	
	
	
	
}
