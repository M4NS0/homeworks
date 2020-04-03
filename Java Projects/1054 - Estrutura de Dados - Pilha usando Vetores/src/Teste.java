import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);
	public static char Escolha() {
		String s;
		char ch;
		
		System.out.printf(	  "\n--------------------\n"
				+ "[I]nserir\n"
				+ "[R]emover topo\n"
				+ "[C]onsultar\n"
				+ "[F]im"
				+ "\n--------------------\n");
		s = leia.nextLine();
		ch = s.charAt(0);
		ch = Character.toLowerCase(ch);
		return ch;
	}
	public static void main(String[] args) {
		
		char ch;
		int erro = 0;
		PilhaVetor pilha = new PilhaVetor();
		pilha.criaPilha();
		do {
			
			ch = Escolha();
			switch (ch) {
			case 'i':
				System.out.printf("Item: ");
				erro = pilha.push(leia.nextLine());
				break;
			case 'r':
				erro = pilha.pop();
				break;
			case 'c':
				pilha.exibePilha();
				//erro = pilha.consultaPilha();
				break;
			}
			// pilha.exibePilha();
			if (erro != 0)
				pilha.imprimeErro(erro);
		} while (ch != 'f');
		System.exit(0);
	}

}
