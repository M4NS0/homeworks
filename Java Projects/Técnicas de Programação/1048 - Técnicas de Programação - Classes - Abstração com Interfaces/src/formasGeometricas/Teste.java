package formasGeometricas;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);
	private static Quadrado quadrado;
	private static Retangulo retangulo;
	private static Circulo circulo;

	public static FormaGeometrica ObtemLadoQuadrado() {
		System.out.print(" Lado: ");
		float ladoA = leia.nextFloat();
		quadrado = new Quadrado(ladoA) {
			
		};

		return quadrado;
	}

	public static FormaGeometrica ObtemLadosRetangulo() {
		System.out.print(" Base: ");
		float base = leia.nextFloat();
		System.out.print(" Altura: ");
		float altura = leia.nextFloat();

		retangulo = new Retangulo(base, altura) {
		};
		return retangulo;
	}

	private static FormaGeometrica ObterCircunferencia() {
		System.out.print(" Raio: ");
		float raio = leia.nextFloat();

		circulo = new Circulo(raio);
		return circulo;
	}

	public static String Escolha() {
		System.out.println("\n [Q]uadrado");
		System.out.println(" [R]etângulo");
		System.out.println(" [C]írculo");
		System.out.print("\n Escolha: ");
		String e = leia.next().toLowerCase();
		return e;
	}

	public static String Escolha0() {
		System.out.println("\n [I]nserir");
		System.out.println(" [V]er");
		System.out.println(" [S]air");
		System.out.print("\n Escolha: ");
		String e0 = leia.next().toLowerCase();
		return e0;

	}

	public static void main(String[] args) {
		ArrayList<FormaGeometrica> lista = new ArrayList<FormaGeometrica>();

		String e0 = "";
		do {
			switch (e0 = Escolha0()) {
			case "i":
				System.out.print(" Quantas formas deseja criar: ");
				int quantidade = leia.nextInt();

				for (int i = 0; i < quantidade; i++) {
					String e = "";

					switch (e = Escolha()) {
					case "q":
						lista.add(ObtemLadoQuadrado());
						break;
					case "r":
						lista.add(ObtemLadosRetangulo());
						break;
					case "c":
						lista.add(ObterCircunferencia());
						break;
					}
				}
				break;
			case "v":
			
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i).equals(quadrado)) {
						System.out.println();
						System.out.println("\n Quadrado: ");
						System.out.println(" Lado: " + quadrado.ladoA);		
						quadrado.calculaArea(); 								
						quadrado.calculaPerimetro();							
						
						
					}
					if (lista.get(i).equals(retangulo)) {
						System.out.println();
						System.out.println(" Retângulo: ");
						System.out.println(" Base: " + retangulo.base);  		
						System.out.println(" Altura: " + retangulo.altura);								retangulo.calculaArea();
						retangulo.calculaPerimetro();
						
					}
					if (lista.get(i).equals(circulo)) {
						System.out.println();
						System.out.println(" Círculo: ");
						System.out.println(" Raio: " + circulo.raio);
						circulo.calculaArea();
						circulo.calculaPerimetro();
					}
				}
				break;
			}

		} while (!e0.equalsIgnoreCase("s"));
		System.out.println("Fim");

	}
}
