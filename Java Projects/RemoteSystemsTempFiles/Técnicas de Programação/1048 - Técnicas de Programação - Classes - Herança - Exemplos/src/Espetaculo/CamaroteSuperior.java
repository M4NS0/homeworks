package Espetaculo;

public class CamaroteSuperior extends Vip{
	protected String localizacao;
	protected Vip v;
	
	
	
	public CamaroteSuperior(Double valor, Double adicional, String localizacao) {
		super(valor, adicional);
		this.localizacao = localizacao;
		v = new Vip(valor, adicional); // cria novo objeto de ingresso "VIP" dentro da classe
	}

	public void imprimeCamaroteSuperior() {
		System.out.println("- Camarote Superior");
		System.out.println("Valor com Adicional: " + adicional);
		System.out.println("     Valor Original: " + valor );
		System.out.println("        Localização: " + localizacao);
		System.out.println();
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Vip getV() {
		return v;
	}

	public void setV(Vip v) {
		this.v = v;
	}

	
}
