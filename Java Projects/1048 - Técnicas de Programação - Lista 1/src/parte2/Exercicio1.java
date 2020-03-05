package parte2;

import java.util.Scanner;

public class Exercicio1 {

	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		float a;
		float b;

		System.out.println("Programa para verificar se dois numeros são divisíveis: \nDigite o primeiro número: ");
		a = leia.nextFloat();

		System.out.println("Digite o segundo número: ");
		b = leia.nextFloat();

		if (a % b == 0) {
			System.out.println("Os números são divisíveis entre si!");
		} else {
			System.out.println("Os números não são divisíveis entre sí");
		}
	}

}
