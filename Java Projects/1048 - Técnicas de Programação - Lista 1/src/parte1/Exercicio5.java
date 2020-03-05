package parte1;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {
	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		ArrayList<Integer> lista= new ArrayList<Integer>();
		int a;
		int b;

		System.out.println("Insira o valor de A: ");
		a = leia.nextInt();
		lista.add(a);

		System.out.println("Insira o valor de B: ");
		b = leia.nextInt();
		lista.add(b);
		
		a = lista.get(1);
		b = lista.get(0);
		
		System.out.println("Invertendo valores das variáveis utilizando um array: ");
		System.out.println("o valor de A: " + a);
		System.out.println("o valor de B: " + b);
	}
}
