package formasGeometricasCorrecao;

public class Quadrado extends Quadrilatero {


	public Quadrado(double lado1) {
		super(1, 1, 1, 1);

	}

	@Override
	public double area() {
		return super.getLado1()*super.getLado1();
	}
	
	
}
