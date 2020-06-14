package Correios;

public class Revista extends Encomenda implements Entrega {
	private String tipo;
	private int mes;
	
	public Revista(String id, String org, String dest, String tipo, int mes) {
		super(id, org, dest);
		this.tipo = tipo;
		this.mes = mes;
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
	public String getTipo() {
		return tipo;
	}

	public int getMes() {
		return mes;
	}
	
	public void getRevista(Encomenda e) {
		System.out.println("\n    -- Revista --"
						 + "\n      Id: " 	+ e.getIdentificador()
						 + "\n  Origem: " 	+ e.getCidadeOrigem()
						 + "\n Destino: " 	+ e.getCidadeDestino()
						 + "\n    Tipo: " 	+ tipo 
						 + "\n     Mês: " 	+ mes);
	

	}

}