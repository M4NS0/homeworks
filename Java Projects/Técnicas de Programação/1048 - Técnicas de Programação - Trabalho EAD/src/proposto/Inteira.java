package proposto;


public class Inteira extends Ingresso {
	final private double valor = 20.00;

	public double getValor() {
		return valor;
	}


	@Override
	public void venderIngresso() {
		System.out.println(" Vendido: Inteira - R$" + valor );
		
	}

}