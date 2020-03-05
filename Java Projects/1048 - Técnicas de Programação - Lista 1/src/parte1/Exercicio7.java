package parte1;
import java.util.Scanner;

public class Exercicio7 {
	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		float notaFinal;
		float exameIntermediario;
		float trabalhoPratico;
		float exameFinal;
		float calculo1;
		float calculo2;
		float calculo3;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite a primera nota: ");
		exameIntermediario = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		trabalhoPratico = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		exameFinal = leia.nextFloat();
		
		calculo1 = exameIntermediario*0.3f;
		calculo2 = trabalhoPratico*0.2f;
		calculo3 = exameFinal*0.5f;
		
		notaFinal = calculo1 + calculo2 + calculo3;
		
		System.out.println("O aluno " + nome + " teve nota final igual a " + notaFinal);
	}
}
