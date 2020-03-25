// OBS:. Algorítmo de Busca em vetor embaralhado com 
// tempo de processamento MAIOR que algoritmo Sequenciado

import java.util.Scanner;

public class Teste {
	static Scanner leia = new Scanner(System.in);

	public static int Escolha() {
		System.out.println("\n---------------------------------------\n" 
							+ "1. Imprime Vetor\n"
							+ "2. Verifica se Nome existe no vetor\n" 
							+ "3. Embaralha Vetor\n" 
							+ "0. Sair\n"
							+ "---------------------------------------\n");
		int e = leia.nextInt();
		return e;
	}

	public static void main(String[] args) {
		String [] v = { "Alice", "Bruno", "Betty", "Bob","Campbell", "Don", "Hendrix","Joan", "Lilian", "Peggy", "Roger", "Theodora", "Thomas"};
		int n = 13;
		int e = 0;
		do {
			e = Escolha();
			switch (e) {
			
			case 1:
				Funcao.imprime(v);
				break;
			
			case 2:
				System.out.println("\nInsira o Nome que deseja buscar no vetor: ");
				String k = leia.next();
				if (Funcao.achaNome(v, k, n) == -1) System.out.println("Valor não encontrado na lista!");
				else System.out.println("\nO nome " + k + " foi encontrado na posição " + (Funcao.achaNome(v, k, n) + 1));
				System.out.println("O tempo de processamento da busca de Números embaralhados foi de: " + Funcao.finalizaTempo() + " Milisegundos");
			
				break;
			case 3:
				Funcao.embaralha(v);
				break;

			}
		} while (e != 0);
		System.out.println("\nArrivederci!");
	}
}
