package Espetaculo;

public class CamaroteInferior extends Normal {
	protected String localizacao;
	protected Normal v;
	


	public CamaroteInferior(Double valor, String localizacao) {
		super(valor);
		this.localizacao = localizacao;
		v = new Normal(valor);
	}

	public void imprimeCamaroteInferior() {
		System.out.println("- Camarote Inferior");
		System.out.println("Valor com Adicional: " +  valor);
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



}
