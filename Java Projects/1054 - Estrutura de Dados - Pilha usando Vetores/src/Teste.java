import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String s;
		PilhaVetor pilha = new PilhaVetor();
		int valor;
		int erro = 0;
		char ch;
		pilha.criaPilha();
		do {
			System.out.printf("[P]ush, P[o]p, [C]onsultar ou [F]im? ");
			do {
				s = entrada.nextLine();
				ch = s.charAt(0);
				ch = Character.toLowerCase(ch);
			} while (ch != 'p' && ch != 'o' && ch != 'c' && ch != 'f');
			switch (ch) {
			case 'p':
				System.out.printf("Valor: ");
				s = entrada.nextLine();
				valor = Integer.parseInt(s);
				erro = pilha.push(valor);
				break;
			case 'o':
				erro = pilha.pop();
				break;
			case 'c':
				erro = pilha.consultaPilha();
				break;
			}
			pilha.exibePilha();
			if (erro != 0)
				pilha.imprimeErro(erro);
		} while (ch != 'f');
		System.exit(0);
	}
}