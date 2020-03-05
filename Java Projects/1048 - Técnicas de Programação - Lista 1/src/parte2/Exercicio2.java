package parte2;

import java.util.Scanner;

public class Exercicio2 {

	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		float n1;
		float n2;
		float media;

		System.out.println("Insira o valor da N1: ");
		n1 = leia.nextFloat();

		System.out.println("Insira o valor da N2: ");
		n2 = leia.nextFloat();

		media = ((n1 * 2) + (n2 * 3)) / (n1 + n2);

		if (media >= 7.0f || media >= 70.0f) {
			System.out.println("Parabéns vc está aprovado, com média: " + media);
		}
		if (media < 3.0f || media < 30.0f) {
			System.out.println("Você foi reprovado, sua anta! Sua média foi: " + media);
		}
		if (media >= 3.0f && media < 7.0f || media >= 30.0f && media < 70.0f) {
		}
		System.out.println("Você está de Recuperação! Sua média foi: " + media);
	}

}
