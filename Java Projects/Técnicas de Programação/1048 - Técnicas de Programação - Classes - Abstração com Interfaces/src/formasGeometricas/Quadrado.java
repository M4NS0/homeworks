package formasGeometricas;

public abstract class Quadrado extends Quadrilatero {
	
	public Quadrado(float ladoA) {
		super(ladoA);
		
	}
	
	public void calculaArea() {
		float area = ladoA*2;
		System.out.println(" A área do Quadrado é de: " + area);
		
	}
	public void calculaPerimetro() {
		float perimetro = ladoA*4;
		System.out.println(" O perímetro do Quadrado é de: " + perimetro);
		
	}

	
}