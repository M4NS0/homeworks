package espetaculo;

public class Vip extends Ingresso {
	protected Double adicional;

	public Vip(Double valor, Double adicional) {
		super(valor);
		this.adicional =  adicional + valor;
	}

	public void imprimeVip() {
		
		System.out.println("- Ingresso com valor Adicional");
	}
	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	
	

}
