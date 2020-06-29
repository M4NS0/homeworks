package entrega;


public class Barco extends Veiculo {
	double Km;
	double indice;

	protected Barco(String tipo, String motor, double Km) {
		super(tipo, motor);
		this.indice = 0.23;
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

	public static void CalculaEmissao(Barco b) {
		System.out.println("Emissão: " + b.CalculaCo2() + "KG/Mês");
	}
}
