package proposto;


public class Meia extends Ingresso {
	final private double valor = 10.00;
	

	public double getValor() {
		return valor;
	}

	@Override
	public void venderIngresso() {
		System.out.println(" Vendido: Meia - R$" + valor );
		
	}


}