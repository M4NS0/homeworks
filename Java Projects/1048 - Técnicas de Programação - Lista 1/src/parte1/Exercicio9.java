package parte1;
import java.util.Scanner;

public class Exercicio9 {

	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		float p;// quantia inicial dep
		float r;// rendimentos anuais
		int n;	// número de anos
		float i;// representação decimal da taxa de lucro i = r/100
		
		System.out.println("Insira a Quantia Inicial Depositada: ");
		p = leia.nextFloat();
		System.out.println("Insira os Rendimentos Anuais: ");
		r = leia.nextFloat();
		System.out.println("Insira o Número de Anos:");
		n = leia.nextInt();
		
		i = r/100;
		float f = (float) (Math.pow(1 + i, n))*p;
		
		System.out.println("O valor de F calculado é de " + f);
	}
}
