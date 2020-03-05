package parte1;
import java.util.Scanner;

public class Exercicio1 {

	private static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);

		String nome;
		float salario;
		float aumento;

		System.out.println("Insira o nome: ");
		nome = leia.next();

		System.out.println("Insira o salário: ");
		salario = leia.nextFloat();

		aumento = salario * 25 / 100;
		salario = salario + aumento;

		System.out.println("O funcionário " + nome + " teve um aumento de " + aumento + " e passará a receber " + salario + "R$");
	}

}
