package formasGeometricas;

public class Retangulo extends Quadrilatero {

	public Retangulo(double base, double altura) {
		super(base, base, altura, altura);
	}

	@Override
	public double area() {
		return super.getBase()*super.getAltura();
	}

}
