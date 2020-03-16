
public class Carro {
	String marca;
	String modelo;
	double valor;

	public Carro(String marca, String modelo, Double valor) {
		this.marca = "Nenhuma";
		this.modelo = "Não Especificado";
		this.valor = 0.0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return marca + "," + modelo + "," + valor;
	}

}
