
import java.util.Scanner;

public class Exercicio1 {
	private static Scanner leia;

	public static void main(String args[]) {
		leia = new Scanner(System.in);

		final int MAX = 100;
		int contador = 0;
		String[] nome = new String[MAX];

		System.out.println("\nLer 100 números de matrículas de alunos e armazenar em um vetor");

		while (contador < MAX) {
			System.out.println("\nDigite o nome da " + (contador + 1) + "º pessoa: ");
			nome[contador] = leia.next();
			contador++;
		}
		contador = 0;
		System.out.println("\n\tLISTA DE NOMES\n       ----------------\n");

		while (contador < MAX) {
			System.out.println("\t → " + nome[contador]);
			contador++;
		}

	}
}
