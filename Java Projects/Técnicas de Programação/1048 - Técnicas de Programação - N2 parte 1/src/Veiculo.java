	

public abstract class Veiculo  implements EmissaoCO2 {
	private String tipo;
	private String motor;
	
	protected Veiculo(String tipo, String motor) {
		this.tipo = tipo;
		this.motor = motor;
	}

	public String getTipo() {
		return tipo;
	}

	public String getMotor() {
		return motor;
	}


	
}
