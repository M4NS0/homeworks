package formasGeometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n, i = 1;
		char f;
		double x, b, h;
		System.out.print(" Quantas formas geométricas pretende criar: ");
		n = leia.nextInt();

		List<FormaGeometrica> figuras = new ArrayList<FormaGeometrica>();

		while (i++ <= n) {
			System.out.println(" Escolha a forma: " + (i - 1) + "\n[Q]uadrado \n[R]etangulo \n[C]irculo");
			f = leia.next().charAt(0);
			f = Character.toLowerCase(f);

			switch (f) {
			case 'q':
				System.out.print(" Digite o lado do Quadrado: ");
				x = leia.nextDouble();
				figuras.add(new Quadrado(x));
				break;
			case 'r':
				System.out.print(" Digite a base do Retângulo: ");
				b = leia.nextDouble();
				System.out.print(" Digite a altura do Retângulo: ");
				h = leia.nextDouble();
				figuras.add(new Retangulo(b, h));
				break;
			case 'c':
				System.out.print(" Digite o raio do Círculo: ");
				x = leia.nextDouble();
				figuras.add(new Circulo(x));
				break;

			}

		}
		System.out.println("\n Informações da Formas cadastradas: ");
		for (FormaGeometrica forma : figuras) {
			if (forma instanceof Quadrado) {
				System.out.println("\n Quadrado: ");
				System.out.println(" Lado     : " + ((Quadrado) forma).getLado1());
				System.out.println(" Área     : " + forma.area());
			}
			if (forma instanceof Retangulo) {
				System.out.println("\n Retângulo: ");
				System.out.println(" Base        :" + ((Retangulo) forma).getBase());
				System.out.println(" Altura      :" + ((Retangulo) forma).getAltura());
				System.out.println(" Área        :" + forma.area());
			}
			if (forma instanceof Circulo) {
				System.out.println("\n Circulo: ");
				System.out.println(" Raio        :" + ((Circulo) forma).getRaio());
				System.out.printf(" Área        :%.2f\n", forma.area());
			}
			System.out.printf(" Perímetro:%.2f\n", forma.perimetro());

		}
	}

}
