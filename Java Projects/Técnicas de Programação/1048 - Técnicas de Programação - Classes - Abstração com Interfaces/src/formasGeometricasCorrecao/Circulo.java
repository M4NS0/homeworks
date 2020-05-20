package formasGeometricasCorrecao;

public class Circulo implements FormaGeometrica {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	@Override
	public double perimetro() {
		return 2*raio*Math.PI;
	}

	@Override
	public double area() {
		return Math.pow(raio,2)*Math.PI;
	}
	

}
