package formasGeometricas;

public class Circulo implements FormaGeometrica{
	float raio;
	
	public Circulo(float raio) {
		this.raio = raio;
	}

	@Override
	public void calculaArea() {
		float area = 3.14f * (raio*raio);
		System.out.println(" A área do Círculo é de: " + area);
		
	}

	@Override
	public void calculaPerimetro() {
		float perimetro = (2*3.14f)*raio;
		System.out.println(" O perímetro do Círculo é de: " + perimetro);
		
	}

}
