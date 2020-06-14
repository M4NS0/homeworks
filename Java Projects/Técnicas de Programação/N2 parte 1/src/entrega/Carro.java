package entrega;


public class Carro extends Veiculo {
	double Km;
	double indice;

	protected Carro(String tipo, String motor, double Km) {
		super(tipo, motor);
		this.indice = 1.24;
		this.Km = Km;
	}

	public double getKm() {
		return Km;
	}

	public double getIndice() {
		return indice;
	}

	@Override
	public double CalculaCo2() {
		return Km * indice;
	}
	
	public static void CalculaEmissao(Carro carro) {
		System.out.println("Emissão: " + carro.CalculaCo2() + "KG/Mês");
	}

}
