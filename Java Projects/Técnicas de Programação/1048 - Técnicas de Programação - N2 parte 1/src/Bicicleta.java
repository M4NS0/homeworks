

public class Bicicleta extends Veiculo {
	double Km;
	double indice;

	protected Bicicleta(String tipo, String motor, double Km) {
		super(tipo, motor);
		this.indice = 0;
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

	public static void CalculaEmissao(Bicicleta c) {
		System.out.println("Emissão: " + c.CalculaCo2() + "KG/Mês");
	}

}
