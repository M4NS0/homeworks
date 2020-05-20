import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static Pessoa obtemPessoa() {
		String pNom, pMat, pTel;
		System.out.println("Digite o nome: ");
		pNom = leia.next();
		System.out.println("Digite a matricula: ");
		pMat = leia.next();
		System.out.println("Digite o telefone: ");
		pTel = leia.next();
		Pessoa aux = new Pessoa(pNom, pMat, pTel);
		return aux;
	}
	
	public static int Menu() {
		int valor;
		System.out.println("\n----------------------\n"
							+ "1. Enfileirar\n"
							+ "2. Desenfileirar\n"
							+ "3. Sair"
							+ "\n----------------------\n");
		return valor = leia.nextInt();
	}

	public static void main(String[] args) {
		Fila fila = new Fila();
		int n;
		Pessoa novo = null;
		do {
			n = Menu();
			switch (n) {
			case 1:
				novo = obtemPessoa();
				fila.enfilerar(novo);
				System.out.println("pilha com " + fila.getTamanho() + " pessoas");
				novo = null;
				break;
			
			case 2:
				novo = fila.desenfileirar();
				if (novo == null) System.out.println("A fila está vazia!");
				else System.out.println(novo.toString());
				System.out.println("pilha com " + fila.getTamanho() + " pessoas");
				novo = null;
				break;
				
			case 3:
				System.out.println("pilha com " + fila.getTamanho() + " pessoas");
				System.out.println("Até mais!");
			}
			
		} while (n != 3);

	}
}
