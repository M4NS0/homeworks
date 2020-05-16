package formasGeometricas;

public abstract class Quadrilatero implements FormaGeometrica {
	float ladoA;
	float ladoB;
	float ladoC;
	float ladoD;

	public Quadrilatero(float ladoA, float ladoB, float ladoC, float ladoD) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;

	}

	public Quadrilatero(float lado) {
		this.ladoA = lado;
	}

	public Quadrilatero(float base, float altura) {
		this.ladoA = base;
		this.ladoB = altura;
	}

	@Override
	public void calculaPerimetro() {
		float perimetro = ladoA + ladoB + ladoC + ladoD;
		System.out.println(" Perímetro: " + perimetro);
	}

	@Override
	public void calculaArea() {
		float area = ladoA * ladoB;
		System.out.println(" Área: " + area);
	}

}
