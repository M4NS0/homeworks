public class Quadrado extends FiguraGeometrica{
	
	float lado;

	public float area() {
		return (float) Math.pow(lado, 2);
	}

	public float perimetro() {
		return lado * 4;
	}
}
