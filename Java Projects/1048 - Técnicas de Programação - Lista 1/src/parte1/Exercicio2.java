package parte1;
import java.util.Scanner;

public class Exercicio2 {
	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);

		float notaBimestral;
		float notaParcial1;
		float notaParcial2;
		String nome;

		System.out.println("Insira o nome: ");
		nome = leia.next();

		System.out.println("Insira a primeira nota de " + nome + " :");
		notaParcial1 = leia.nextFloat();

		System.out.println("Insira a segunda nota de " + nome + " :");
		notaParcial2 = leia.nextFloat();

		notaBimestral = ((notaParcial1 * 2) + (notaParcial2 * 3)) / notaParcial1 + notaParcial2;

		System.out.println("\nO aluno " + nome + " obteve média: " + notaBimestral);
	}
}